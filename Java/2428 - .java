import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HumbertombMoralombsSequence {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(in.readLine());
        while (n != 0) {
            System.out.println((int) Math.ceil(Math.sqrt(n)));
            n = Integer.parseInt(in.readLine());
        }
    }
}
