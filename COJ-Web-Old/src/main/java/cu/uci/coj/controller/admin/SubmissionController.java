package cu.uci.coj.controller.admin;

import java.io.IOException;
import java.security.Principal;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.TypeMismatchException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ClassUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cu.uci.coj.config.Config;
import cu.uci.coj.controller.BaseController;
import cu.uci.coj.dao.AchievementDAO;
import cu.uci.coj.dao.ContestDAO;
import cu.uci.coj.dao.ProblemDAO;
import cu.uci.coj.dao.SubmissionDAO;
import cu.uci.coj.model.Contest;
import cu.uci.coj.model.Filter;
import cu.uci.coj.model.Language;
import cu.uci.coj.model.Rejudge;
import cu.uci.coj.model.Status;
import cu.uci.coj.model.SubmissionJudge;
import cu.uci.coj.utils.Utils;
import cu.uci.coj.utils.paging.IPaginatedList;
import cu.uci.coj.utils.paging.PagingOptions;
import cu.uci.coj.validator.submissionValidator;
import cu.uci.coj.utils.Notification;
import org.springframework.web.servlet.view.RedirectView;

@Controller("ContestSubmissionController")
@RequestMapping(value = "/admin")
public class SubmissionController extends BaseController {

    private static final long serialVersionUID = 8378556627163188126L;
    @Resource
    private ProblemDAO problemDAO;
    @Resource
    private SubmissionDAO submissionDAO;
    @Resource
    private ContestDAO contestDAO;
    @Resource
    private AchievementDAO achievementDAO;
    @Resource
    private submissionValidator validator;
    @Resource
    private Utils utils;

    /*
   * RF19 Rejuzgar concurso
   * */
    @RequestMapping(value = "/managesubmissions.xhtml", method = RequestMethod.GET)
    public String allSubmissions(Model model, Filter filter,
                                 PagingOptions options) {
        LinkedList<Status> statuslist = new LinkedList<Status>();
        String[] ar = Config.getProperty("judge.status").split(",");
        for (int i = 0; i < ar.length; i++) {
            String string = ar[i];
            statuslist.add(new Status(string, Config.getProperty(string
                    .replaceAll(" ", "."))));
        }
        List<Language> languagelist = submissionDAO.getEnabledLanguages();
        filter.fillFirstParam();
        filter.fillSecondParam();
        model.addAttribute("statuslist", statuslist);
        model.addAttribute("languagelist", languagelist);
        model.addAttribute("filter", filter);

        return "/admin/managesubmissions";
    }

    /*
   * RF19 Rejuzgar concurso
   * */
    @RequestMapping(value = "/tables/managesubmissions.xhtml", method = RequestMethod.GET)
    public String tableSubmissions(Model model, Filter filter, /*@RequestParam(required=false, value="username") String username,
                                   @RequestParam(required=false, value="startDate") Date startDate, @RequestParam(required=false, value="endDate") Date endDate,
                                   @RequestParam(required=false, value="cid") Integer cid, @RequestParam(required=false, value="startSid") Integer startSid,
                                   @RequestParam(required=false, value="endSid") Integer endSid, @RequestParam(required=false, value="pid") Integer pid,
                                   @RequestParam(required=false, value="status") String status, @RequestParam(required=false, value="language") String language,*/
                                   PagingOptions options) {
        /*Filter filter = new Filter(startDate, endDate, username, cid, status, language, pid, submissionDAO.getEnabledLanguages(), language);*/
        int found = submissionDAO.countSubmissionsAdmin(filter);
        if (found != 0) {
            IPaginatedList<SubmissionJudge> submissions = submissionDAO
                    .getSubmissionsAdmin(filter, found, options, false);
            model.addAttribute("submissions", submissions);
        }
        return "/admin/tables/managesubmissions";
    }

    /*
   * RF19 Rejuzgar concurso
   * */
    @RequestMapping(value = "/rejudgesubmissions.xhtml", method = RequestMethod.POST)
    public String rejudgeSubmissions(Model model, @Valid @ModelAttribute("filter") Filter filter, /**//*@RequestParam(required=false, defaultValue = "", value="username") String username,
                                     @RequestParam(required=false, value="startDate", defaultValue = "0") Date startDate, @RequestParam(required=false, value="endDate", defaultValue = "0") Date endDate,
                                     @RequestParam(required=false, value="cid") Integer cid, @RequestParam(required=false, value="startSid") Integer startSid,
                                     @RequestParam(required=false, value="endSid") Integer endSid, @RequestParam(required=false, value="pid") Integer pid,
                                     @RequestParam(required=false, value="status") String status, @RequestParam(required=false, value="language") String language,*/
                                     PagingOptions options, RedirectAttributes redirectAttributes, BindingResult bindingResult) {
        /*Filter filter = new Filter(startDate, endDate, username, cid, status, language, pid, submissionDAO.getEnabledLanguages(), language);*/
        if (bindingResult.hasErrors()){
            //
        }

        int found = submissionDAO.countSubmissionsAdmin(filter);

        if (found != 0) {
            IPaginatedList<SubmissionJudge> submissions = submissionDAO
                    .getSubmissionsAdmin(filter, found, options, true);

            model.addAttribute("submissions", submissions);

            utils.rejudgeSubmits(filter);
        }
        LinkedList<Status> statuslist = new LinkedList<Status>();
        String[] ar = Config.getProperty("judge.status").split(",");
        for (int i = 0; i < ar.length; i++) {
            String string = ar[i];
            statuslist.add(new Status(string, Config.getProperty(string
                    .replaceAll(" ", "."))));
        }
        List<Language> languagelist = submissionDAO.getEnabledLanguages();
        filter.fillFirstParam();
        filter.fillSecondParam();
        model.addAttribute("statuslist", statuslist);
        model.addAttribute("languagelist", languagelist);
        model.addAttribute("filter", filter);
        redirectAttributes.addFlashAttribute("message", Notification.getSuccesfullRejudge());

        return "redirect:/admin/managesubmissions.xhtml";
        //return "/admin/managesubmissions";
    }

    @RequestMapping(value = "/managesubmission.xhtml", method = RequestMethod.GET)
    public String manageSubmission(Model model, @RequestParam("sid") Integer sid) {
        SubmissionJudge submission = submissionDAO.loadSubmissionAdmin(sid);
        model.addAttribute("planguages",
                submissionDAO.objects("get.all.languages", Language.class));
        List<Status> statuslist = new LinkedList<Status>();
        String[] ar = Config.getProperty("judge.status").split(",");
        for (int i = 0; i < ar.length; i++) {
            String string = ar[i];
            statuslist.add(new Status(string, Config.getProperty(string
                    .replaceAll(" ", "."))));
        }
        model.addAttribute("results", statuslist);
        model.addAttribute("submission", submission);
        return "/admin/managesubmission";
    }

    @RequestMapping(value = "/managesubmission.xhtml", method = RequestMethod.POST)
    public String manageSubmission(Principal principal, Model model,
                                   SubmissionJudge submission, BindingResult result, RedirectAttributes redirectAttributes) {
        validator.validate(submission, result);
        if (result.hasErrors()) {
            model.addAttribute("planguages",
                    submissionDAO.objects("get.all.languages", Language.class));
            List<Status> statuslist = new LinkedList<Status>();
            String[] ar = Config.getProperty("judge.status").split(",");
            for (int i = 0; i < ar.length; i++) {
                String string = ar[i];
                statuslist.add(new Status(string, Config.getProperty(string
                        .replaceAll(" ", "."))));
            }
            model.addAttribute("results", statuslist);
            model.addAttribute("submission", submission);
            return "/admin/managesubmission";
        }
        submissionDAO.updateSubmission(submission);
        submissionDAO.dml("insert.log",
                "editing SubmissionJudge " + submission.getSid(),
                getUsername(principal));
        redirectAttributes.addFlashAttribute("message", Notification.getSuccesfullUpdate());
        return "redirect:/admin/managesubmissions.xhtml";
    }

    @RequestMapping(produces = "application/json", value = "/24h/rejudge.json", method = RequestMethod.GET, headers = {"Accept=application/json"})
    public
    @ResponseBody
    boolean rejudgeSubmit(Model model,
                          @RequestParam(value = "sid") int sid) {

        return utils.rejudgeSubmit(sid) != null;
    }

    @RequestMapping(produces = "application/json", value = "/contest/rejudge.json", method = RequestMethod.GET, headers = {"Accept=application/json"})
    public
    @ResponseBody
    boolean rejudgeContestSubmit(Model model,
                                 @RequestParam(value = "sid") int sid) {

        return utils.rejudgeContestSubmit(sid) != null;
    }

    @RequestMapping(produces = "application/json", value = "/24h/togglesub.json", method = RequestMethod.GET, headers = {"Accept=application/json"})
    public
    @ResponseBody
    boolean toggleSubmit(Model model,
                         @RequestParam(value = "sid") int sid) {
        boolean enabled = baseDAO.bool("toggle.submit", sid);
        SubmissionJudge submit = submissionDAO.object("select.submition.sid",
                SubmissionJudge.class, sid);
        if (enabled)
            submissionDAO.applyEffects(submit, true);
        else
            submissionDAO.removeEffects(submit, true);
        return enabled;
    }

    @RequestMapping(produces = "application/json", value = "/contest/togglesub.json", method = RequestMethod.GET, headers = {"Accept=application/json"})
    public
    @ResponseBody
    boolean toggleContestSubmit(Model model,
                                @RequestParam(value = "sid") int sid) {
        boolean enabled = baseDAO.bool("toggle.contest.submit", sid);
        // por supuesto es necesario repuntear despues de hacer esto. No se pone
        // automatico porque cuando se marquen varios en una lista, no se puede
        // repuntear en cada una.
        return enabled;
    }

    @RequestMapping(produces = "application/json", value = "/queuecount.json", method = RequestMethod.GET, headers = {"Accept=application/json"})
    public
    @ResponseBody
    int rejudgeSubmit(Model model) {

        return utils.getQueuedSubmitsCount();
    }

    @Deprecated
    private void validateRejudge(String sid1, String sid2, String pid,
                                 String status, BindingResult result) {
        boolean has = false;
        if (sid1 != null && sid2 != null
                && new Integer(sid2) - new Integer(sid1) > 200) {
            has = true;
        }
        if (has) {
            result.reject("rejudge", "to many submissions");
        }
    }

    @RequestMapping(value = "/contestsubmission.xhtml", method = RequestMethod.GET)
    public String contestSubmission(Model model,
                                    @RequestParam("sid") Integer sid) {
        SubmissionJudge submission = submissionDAO
                .loadContestSubmissionAdmin(sid);
        List<Status> statuslist = new LinkedList<Status>();
        String[] ar = Config.getProperty("judge.status").split(",");
        for (int i = 0; i < ar.length; i++) {
            String string = ar[i];
            statuslist.add(new Status(string, Config.getProperty(string
                    .replaceAll(" ", "."))));
        }
        model.addAttribute("planguages",
                submissionDAO.objects("get.all.languages", Language.class));
        model.addAttribute("results", statuslist);
        model.addAttribute(submission);
        return "/admin/contestsubmission";
    }

    @RequestMapping(value = "/contestsubmission.xhtml", method = RequestMethod.POST)
    public String contestSubmission(Model model, SubmissionJudge submission,
                                    BindingResult result) {
        validator.validate(submission, result);
        if (result.hasErrors()) {
            List<Status> statuslist = new LinkedList<Status>();
            String[] ar = Config.getProperty("judge.status").split(",");
            for (int i = 0; i < ar.length; i++) {
                String string = ar[i];
                statuslist.add(new Status(string, Config.getProperty(string
                        .replaceAll(" ", "."))));
            }
            model.addAttribute("planguages",
                    submissionDAO.objects("get.all.languages", Language.class));
            model.addAttribute("results", statuslist);
            model.addAttribute(submission);
            return "/admin/contestsubmission";
        }
        submissionDAO.updateContestSubmission(submission);
        return "redirect:/admin/contestsubmission.xhtml?sid="
                + submission.getSid();
    }

    @ExceptionHandler(TypeMismatchException.class)
    public RedirectView handleIOExceptionN(TypeMismatchException e, HttpServletRequest request) {
        RedirectView redirectView = new RedirectView("/admin/errorsubmissionRedirectPage.xhtml");
        redirectView.addStaticAttribute("errorMessage", e.getMessage());
        return redirectView;
    }

    @RequestMapping(value = "/errorsubmissionRedirectPage.xhtml", method = RequestMethod.GET)
    public String errorRedirectPageN(HttpServletRequest request, Model model) {
        model.addAttribute("notint", true);
        return "/admin/tables/managesubmissions";
    }

    @ExceptionHandler(IOException.class)
    public String handleIOException(IOException ex, HttpServletRequest request) {
        return ClassUtils.getShortName(ex.getClass());
    }
}
