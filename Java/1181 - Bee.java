
import java.io.*;

public class Bee1181 {

    private static final InputStreamReader isr = new InputStreamReader(System.in);
    private static final BufferedReader br = new BufferedReader(isr);
    private static final OutputStreamWriter osw = new OutputStreamWriter(System.out);
    private static final BufferedWriter bw = new BufferedWriter(osw);

    public static void main(String[] args) throws IOException {
        int n;
        while (true) {
            n = Integer.parseInt(br.readLine());
            if (n == -1) {
                break;
            }
            bee(n);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    private static void bee(int n) throws IOException {
        int m = 0, t = 1, aux;
        for (int i = 0; i < n; i++) {
            aux = m;
            m = t;
            t += (aux + 1);
        }
        bw.append(m + " " + t);
    }
}
