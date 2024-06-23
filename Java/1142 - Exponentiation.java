import java.math.BigDecimal;
import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    Scanner l = new Scanner(System.in);
    BigDecimal multi = new BigDecimal("0");
    while (l.hasNext()) {
      int r, i;
      String s;
      multi = l.nextBigDecimal();
      r = l.nextInt();
      String c = multi.toString();
      multi = multi.pow(r);
      if (c.charAt(0) == '0') {
        s = multi.toPlainString();
      } else {
        s = multi.toString();
      }
      int pos = s.length() - 1;
      int cont = 0;
      if (s.charAt(pos) == '0') {
        while (s.charAt(pos) == '0') {
          cont++;
          pos--;
        }
        int x = s.length();
        int y = x - cont;
        s = s.substring(0, y);
      }
      if (s.charAt(0) == '0') {
        int f = s.length();
        s = s.substring(1, f);
      }
      System.out.println(s);
    }
  }
}
