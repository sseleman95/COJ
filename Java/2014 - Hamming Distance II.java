
import java.io.*;

public class HammingDistanceII2014 {

    private static final InputStreamReader isr = new InputStreamReader(System.in);
    private static final BufferedReader br = new BufferedReader(isr);
    private static final OutputStreamWriter osw = new OutputStreamWriter(System.out);
    private static final BufferedWriter bw = new BufferedWriter(osw);

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        String[] line;
        for (int i = 0; i < t; i++) {
            line = br.readLine().split("\\s+");
            bitstring(line[0], Integer.parseInt(line[1]), i+1);
        }
        bw.flush();
        bw.close();
    }

    private static void bitstring(String s, int d, int ca) throws IOException {
        bw.append("Case #"+ca+": ");
        int t = s.length();
        char[] c = s.toCharArray();
        for (int i = 0; i < t; i++) {
            if (d == 0) {
                break;
            }
            if (s.charAt(i) == '1') {
                c[i] = '0';
                d--;
            }
        }
        if (d > 0) {
            for (int i = t - 1; i >= 0; i--) {
                if (d == 0) {
                    break;
                }
                if (s.charAt(i) == '0') {
                    c[i] = '1';
                    d--;
                }
            }
        }
        for (int i = 0; i < t; i++) {
            bw.append(c[i]);
        }
        bw.newLine();
    }
}
