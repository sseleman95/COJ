import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    Scanner l = new Scanner(System.in);

    int a = l.nextInt();
    String s, d, f, g;
    int x, y, c;
    for (int i = 0; i < a; i++) {
      s = l.next();
      BigInteger n = new BigInteger(s, 3);
      d = s.toString(s, 3);
      d = n.toString();

      System.out.println(d);
      f = ("" + d.charAt(d.length() - 1));
      g = ("" + d.charAt(d.length() - 2));

      x = Integer.parseInt("" + f);
      y = Integer.parseInt(d);
      x += y;

      if (x % 4 == 0) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}
