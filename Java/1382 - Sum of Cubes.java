import java.math.BigInteger;
import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    BigInteger a = new BigInteger("0");
    BigInteger modulo = new BigInteger("1000007");
    BigInteger b = new BigInteger("0");

    Scanner l = new Scanner(System.in);
    a = l.nextBigInteger();
    b = l.nextBigInteger();
    a = a.pow(3);
    b = b.pow(3);
    System.out.println(a);
    System.out.println(b);
    a = a.add(b);
    System.out.println(a);
    a = a.mod(modulo);
    System.out.println(a);
  }
}
