import java.math.BigInteger;
import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    Scanner l = new Scanner(System.in);
    BigInteger mod = new BigInteger("3");
    BigInteger cero = new BigInteger("0");
    BigInteger residuo = new BigInteger("0");
    int a = l.nextInt();
    for (int i = 0; i < a; i++) {
      String s = l.next();
      BigInteger n = new BigInteger(s, 2);
      residuo = (n.mod(mod));
      int res = residuo.compareTo(cero);
      if (res == 0) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}
