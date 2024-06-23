import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class HidingMessages {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in),1024*8);
        StringTokenizer st;
        PrintWriter pw = new PrintWriter(System.out, false);
        int T;
        T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            for (int j = 0; j < N; j++) {
                String res = "";
                String cad = br.readLine();
                for (int k = 0; k < cad.length(); k++) {
                    if ((int) cad.charAt(k) >= 65 && (int) cad.charAt(k) <= 90) {
                        int aux = (int) cad.charAt(k) + K%26;
                        if (aux > 90) {
                            aux -= 26;
                            res += (char)aux;
                        } else {
                            res += (char)aux;
                        }
                    }
                    else{
                        res += cad.charAt(k);
                    }
                }
                pw.println(res);
            }
        }
        pw.close();

    }
}
