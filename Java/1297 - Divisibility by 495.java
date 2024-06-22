import java.math.BigInteger;
import java.util.Scanner;

public class JavaApplication4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            BigInteger n = sc.nextBigInteger();
            if (n.remainder(new BigInteger("495")).equals(new BigInteger("0"))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}