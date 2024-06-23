import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Genetic {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        Integer numOfTestCases = Integer.parseInt(in.readLine());
        String M, N, MN;
        String[] NMArray;
        for (int i = 0; i < numOfTestCases; i++) {
            MN = in.readLine();
            NMArray = MN.split(" ");
            M = NMArray[0];
            N = NMArray[1];

            if (M.contains("T") && M.contains(N)) {
                System.out.println('Y');
            } else {
                System.out.println('N');
            }
        }
    }
}
