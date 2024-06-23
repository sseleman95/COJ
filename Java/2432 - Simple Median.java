import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SimpleMedian {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {

        int n = Integer.parseInt(in.readLine());
        String readed;
        String[] readedArray;
        long[] longArray;

        while (n != 0) {
            longArray = new long[n];
            readed = in.readLine();
            readedArray = readed.split(" ");

            for (int i = 0; i < n; i++) {
                longArray[i] = Long.parseLong(readedArray[i]);
            }

            Arrays.sort(longArray);

            if (n % 2 == 0) {
                System.out.println(String.format("%.1f", (double) (longArray[n / 2] + longArray[(n / 2) - 1]) / 2));
            } else {
                System.out.println(String.format("%.1f", (double) longArray[n / 2]));
            }

            n = Integer.parseInt(in.readLine());
        }
    }
}
