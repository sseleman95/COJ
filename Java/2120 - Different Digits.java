
import java.io.*;
import java.util.*;

public class DifferentDigits2120 {

    private static final InputStreamReader isr = new InputStreamReader(System.in);
    private static final BufferedReader br = new BufferedReader(isr);
    private static final OutputStreamWriter osw = new OutputStreamWriter(System.out);
    private static final BufferedWriter bw = new BufferedWriter(osw);
    private static final Set<Character> set = new TreeSet<>();

    public static void main(String[] args) throws IOException {
        String[] line;
        int n, m, sum;
        while (br.ready()) {
            line = br.readLine().split("\\s+");
            n = Integer.parseInt(line[0]);
            m = Integer.parseInt(line[1]);
            sum = 0;
            for (int i = n; i <= m; i++) {
                sum += repite(String.valueOf(i));
            }
            bw.append(sum+"");
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    private static int repite(String n) {
        set.clear();
        boolean repeat = false;
        for (int i = 0; i < n.length(); i++) {
            if (set.contains(n.charAt(i))) {
                return 0;
            } else {
                set.add(n.charAt(i));
            }
        }
        return 1;
    }
}
