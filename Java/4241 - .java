import java.io.*;
import java.util.StringTokenizer;

public class EgyptianBinarySystem {
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

        public long nextLong() {
            return Long.parseLong(next());
        }
    }

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        char[] cad = in.next().toCharArray();

        int ones = 0;

        for (int i = 0; i < cad.length; i++) {
            if(cad[i] == '1') ones++;
        }

        long ans = (long)(ones + 1) * (ones) / 2;
        out.println(ans);
        out.close();
    }
}
