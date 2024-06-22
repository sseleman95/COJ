import java.math.BigInteger;
import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner entradaEscaner = new Scanner(System.in);
        BigInteger n = entradaEscaner.nextBigInteger();
        
        while (!n.equals(BigInteger.valueOf(0))) { 
            if (n.mod(BigInteger.valueOf(11)).equals(BigInteger.valueOf(0))) {
                System.out.println(n+" is a multiple of 11.");
            } else {
                System.out.println(n+" is not a multiple of 11.");
            }             
            n = entradaEscaner.nextBigInteger();
        }
    }
}