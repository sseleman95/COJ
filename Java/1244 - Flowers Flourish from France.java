import java.util.Scanner;
import java.util.StringTokenizer;

public class main {

  public static void main(String[] args) {
    Scanner l = new Scanner(System.in);

    String s = l.nextLine();
    while (s.charAt(0) != '*') {
      int sum = 0, cont = 0;
      String i = ("" + s.charAt(0));
      char comp = s.charAt(0);
      String j;

      if (comp > 96) {
        j = i.toUpperCase();
      } else {
        j = i.toLowerCase();
      }
      StringTokenizer st = new StringTokenizer(s, " ");
      while (st.hasMoreTokens()) {
        String y = (st.nextToken());
        String x = ("" + y.charAt(0));
        if (x.equals(i) || x.equals(j)) {
          sum++;
        }
        cont++;
      }
      if (cont == sum) {
        System.out.println("Y");
      } else {
        System.out.println("N");
      }
      s = l.nextLine();
    }
  }
}
