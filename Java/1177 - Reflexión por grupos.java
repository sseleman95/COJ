import java.math.*;
import java.util.*;

public class COJ2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    while (a != 0) {
      String s = sc.next();
      int y = (s.length() / a);
      int x = y;

      int g = 0;
      for (int i = y; i <= s.length(); i += y) {
        for (int j = x - 1; j >= g; j--) {
          System.out.print(s.charAt(j));
        }
        x += y;
        g += y;
      }
      System.out.println("");
      a = sc.nextInt();
    }
  }
}
