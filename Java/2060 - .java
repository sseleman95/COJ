import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class InDebt {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, false);
        int n;
        while ((n = Integer.parseInt(br.readLine())) != -1) {
            int suma = 0;
            int res = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                suma += Integer.parseInt(st.nextToken());
                if (suma % 100 == 0) {
                    res++;
                }
            }
            pw.println(res);
        }
        pw.close();
    }
}
