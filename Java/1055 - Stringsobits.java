import java.util.ArrayList;
import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    Scanner l = new Scanner(System.in);
    ArrayList<String> total = new ArrayList<String>();
    int a, b, c, r = 0;
    while (l.hasNext()) {
      a = l.nextInt();
      if (a > r) {
        r = a;
      }
      b = l.nextInt();
      if (b > r) {
        r = b;
      }
      c = l.nextInt();
      if (c > r) {
        r = c;
      }
      String y = Integer.toString(r, 2);
      System.out.println(y);
    }
  }
}
