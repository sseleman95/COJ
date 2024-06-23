import java.util.ArrayList;
import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    Scanner l = new Scanner(System.in);
    ArrayList<Integer> total = new ArrayList<Integer>();
    int T, n, st, d, p, pt = 0, x = 0;
    T = l.nextInt();
    n = l.nextInt();
    for (int j = 0; j < T; j++) {
      for (int i = 0; i < n; i++) {
        st = l.nextInt();
        d = l.nextInt();
        p = l.nextInt();
        if (i == 0) {
          x = st + d;
          pt = p;
        }
        if (st > x) {
          x = st + d;
          pt = pt + p;
        }
      }

      total.add(pt);
      pt = 0;
      x = 0;
    }
    for (int i = 0; i < total.size(); i++) {
      System.out.println(total.get(i));
    }
  }
}
