import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class HusbandsAssociation {
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

        int n = in.nextInt();
        int t = in.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        Arrays.sort(nums);
        int first = 0;
        int ta = t;
        for (int i = 0; i < n; i++) {
            if (ta - nums[i] > 0) {
                ta -= nums[i];
                first++;
            } else break;
        }
        int second = 0;
        int tb = t;
        for (int i = n - 1; i >= 0; i--) {
            if (tb - nums[i] > 0) {
                tb -= nums[i];
                second++;
            }
        }
        out.println(second+ " " + first);
        out.close();
    }
}
