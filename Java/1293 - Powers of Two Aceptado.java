import java.util.Scanner;
import java.math.BigInteger;

public class PowerOfTwo {
    
    public static void main(String[] args) {
        Scanner    in = new Scanner(System.in);
        int value = in.nextInt();
        System.out.println(BigInteger.valueOf(2).pow(value));
    }
    
}
