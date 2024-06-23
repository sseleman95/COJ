import java.math.BigInteger;
import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    Scanner l = new Scanner(System.in);
    BigInteger i = new BigInteger("2");

    BigInteger j = new BigInteger("1");
    BigInteger aumenta = new BigInteger("1");
    BigInteger aumentaj = new BigInteger("1");

    int a = l.nextInt();
    for (i = i; i.longValue() <= a; i = i.add(aumenta)) {
      j = j.multiply(i);
      j.add(aumentaj);
      i.add(aumenta);
    }
    String s = j.toString();
    int k = Integer.parseInt("" + s.charAt(s.length() - 1));
    while (k == 0) {
      int n = 2;
      k = Integer.parseInt("" + s.charAt(s.length() - n));
      n++;
    }
    System.out.println(k);
  }
}
