/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cu.uci.uengine.runner.impl;

import cu.uci.uengine.runner.Limits;
import cu.uci.uengine.runner.Runner;
import cu.uci.uengine.runner.Runnable;
import cu.uci.uengine.runner.RunnerContext;
import cu.uci.uengine.runner.RunnerResult;
import cu.uci.uengine.runner.SandboxResults;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

/**
 *
 * @author lan
 */
@Component
public class FileRunner implements Runner {

    static Log log = LogFactory.getLog(FileRunner.class);

    @Resource
    private Properties properties;

    private HashMap<String, String> executionCommands;

    @PostConstruct
    private void loadLanguages() throws IOException {
        Properties langProps = new Properties();
        langProps.load(ClassLoader
                .getSystemResourceAsStream("languages.properties"));

        String[] languages = langProps.getProperty("language.list").split(",");
        executionCommands = new HashMap();

        for (String language : languages) {

            language = language.trim();

            String executionCommand = langProps.getProperty(language + ".exec").trim();

            if (!StringUtils.isEmpty(executionCommand)) {
                executionCommands.put(language, executionCommand);
            }
        }
    }

    private String buildCommand(String language, String filePath, String directoryPath) {
        String command = executionCommands.get(language);

        command = command.replace("<EXE>", FilenameUtils.getName(filePath));
        command = command.replace("<EXEDIR>", directoryPath);
        command = command.replace("<EXEPATH>", filePath);
        return command;
    }

    @Override
    public RunnerResult run(Runnable runnable, RunnerContext runnerContext) throws IOException, InterruptedException {

        String command = buildCommand(runnable.getLanguageName(), runnable.getRunnableFile().getAbsolutePath(), runnerContext.getTemporaryDirectory().getAbsolutePath());

        log.debug("Running dataset " + runnerContext.getInputFile().getName());

        String name = FilenameUtils.getBaseName(runnerContext.getInputFile().getName());

        File outFile = new File(runnerContext.getTemporaryDirectory(), name + ".out");
        File errFile = new File(runnerContext.getTemporaryDirectory(), name + ".err");

        ProcessBuilder pb = buildProcessBuilder(runnable.getLimits(), runnable.getLanguageName(), runnerContext.getInputFile().getAbsolutePath(), outFile, errFile, command, String.valueOf(runnable.getId()),runnable.isTrusted());

        Process process = pb.start();

        process.waitFor();

        if (process.exitValue() != 0) {
            byte[] processError = new byte[process.getErrorStream().available()];
            process.getErrorStream().read(processError);
            return new RunnerResult(RunnerResult.Result.IE, FileUtils.readFileToString(errFile) + new String(processError));
        }
        // result,usertime,cputime,memory
        String[] results = IOUtils.toString(process.getInputStream())
                .split(",");

        // el resultado OK significa que no dio problema ejecutar
        // con libsandbox. Los demas resultados son errores internos
        // o resultados que no precisan que se siga ejecutando (TLE,
        // MLE, etc.)
        // En OK se debe seguir con el proximo juego de datos, los
        // demas resultados ya detienen la ejecucion.
        RunnerResult result = null;

        String resultCode = results[SandboxResults.RESULT];

        switch (resultCode) {
            case "OK":
                result = new RunnerResult(RunnerResult.Result.OK, name, Long.valueOf(results[SandboxResults.USER_TIME]), Long.valueOf(results[SandboxResults.CPU_TIME]), Long.valueOf(results[SandboxResults.MEMORY]) * 1024);
                break;
            case "AT":
                result = new RunnerResult(RunnerResult.Result.RT);
                result.messageConcat(FileUtils.readFileToString(errFile));
                break;
            case "TL":
                result = new RunnerResult(RunnerResult.Result.CTL);
                break;
            case "RF":
            case "ML":
            case "OL":
            case "RT":
            case "IE":
            case "BP":
            case "PD":
                result = new RunnerResult(RunnerResult.Result.valueOf(resultCode));
                result.messageConcat(FileUtils.readFileToString(errFile));
                break;
        }

        if (outFile.length() > runnable.getLimits().getMaxOutput()) {
            result = new RunnerResult(RunnerResult.Result.OL);
        }

        return result;
    }

    private ProcessBuilder buildProcessBuilder(Limits limits, String language, String inputPath, File outFile, File errFile, String command, String id, boolean trusted) {
        List<String> uengineArgs = new ArrayList<>();
        uengineArgs.add(properties.getProperty("python.path"));
        uengineArgs.add(properties.getProperty("uengine.script"));

        uengineArgs.add("--identifier");
        uengineArgs.add(id);
        uengineArgs.add("--language");
        uengineArgs.add(language);
        uengineArgs.add("--input");
        uengineArgs.add(inputPath);
        uengineArgs.add("--output");
        uengineArgs.add(outFile.getAbsolutePath());
        uengineArgs.add("--errors");
        uengineArgs.add(errFile.getAbsolutePath());
        uengineArgs.add("--time-limit");
        uengineArgs.add(String.valueOf(limits.getMaxCaseExecutionTime()));
        uengineArgs.add("--memory-limit");
        uengineArgs.add(String.valueOf(limits.getMaxMemory()));

        if (trusted)
            uengineArgs.add("--trusted");
        
        uengineArgs.add("--program");
        uengineArgs.addAll(Arrays.asList(command.split(" ")));

        String[] uengineArgsArray = uengineArgs.toArray(new String[0]);

        if (log.isTraceEnabled()) {
            log.trace(Arrays.toString(uengineArgsArray));
        }

        return new ProcessBuilder(uengineArgsArray);
    }

    @Override
    public boolean isRunnable(String language) {
        return executionCommands.containsKey(language);
    }

}
