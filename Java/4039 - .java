import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CojJalap solver = new CojJalap();
        solver.solve(1, in, out);
        out.close();
    }

    static class CojJalap {
        int[] criba;

        void prec() {
            for (int i = 0; i < criba.length; i++) {
                criba[i] = i;
            }
            for (int i = 2; i * i <= criba.length; i++) {
                if (criba[i] == i) {
                    for (int j = 2; i * j < criba.length; j++) {
                        criba[j * i] = i;
                    }
                }
            }
        }

        int divi(int n) {
            HashMap<Integer, Integer> map = new HashMap<>();
            while (n != 1) {
                if (!map.containsKey(criba[n])) map.put(criba[n], 1);
                else map.put(criba[n], map.get(criba[n]) + 1);
                n /= criba[n];
            }
            int ans = 1;
            for (Map.Entry<Integer, Integer> val : map.entrySet()) {
                ans *= val.getValue() + 1;
            }
            return ans;
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {

            criba = new int[1000010];
            prec();
            int t = in.nextInt();
            int caso = 1;
            while (t-- > 0) {
                int n = in.nextInt();
if(n % 2 == 1) {
                out.println("Case #" + caso++ + ": " + (n- 1 - divi(n)));
} else 
                out.println("Case #" + caso++ + ": " + (n - divi(n)));

            }
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

