import java.math.BigInteger;
import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner entradaEscaner = new Scanner(System.in);
        int m;
        m = entradaEscaner.nextInt();
        for (int i = 0; i < m; i++) {
            BigInteger n = entradaEscaner.nextBigInteger();
            if (n.mod(BigInteger.valueOf(4)).equals(BigInteger.valueOf(0))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }   
        }
    }
}