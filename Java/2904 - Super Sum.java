import java.math.BigInteger;
import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    Scanner l = new Scanner(System.in);
    BigInteger N = new BigInteger("0");
    BigInteger R = new BigInteger("0");
    int T;
    T = l.nextInt();
    for (int i = 0; i < T; i++) {
      N = N.add(l.nextBigInteger());
    }
    System.out.println(N);
  }
}
