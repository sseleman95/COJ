import java.util.ArrayList;
import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    Scanner l = new Scanner(System.in);
    ArrayList<Integer> total = new ArrayList<Integer>();
    int H1 = 1, M1 = 1, H2 = 1, M2 = 1, T1 = 0, T2 = 0;
    do {
      H1 = l.nextInt();
      M1 = l.nextInt();
      H2 = l.nextInt();
      M2 = l.nextInt();
      if ((H1 + M1 + H2 + M2) != 0) {
        T1 = (H1 * 60) + M1;
        T2 = (H2 * 60) + M2;
        if (T2 < T1) {
          T2 += 1440;
          total.add(T2 - T1);
        } else {
          total.add(T2 - T1);
        }
      }
      T1 = 0;
      T2 = 0;
      //z=0;
    } while ((H1 + M1 + H2 + M2) != 0);
    for (int i = 0; i < total.size(); i++) {
      System.out.println(total.get(i));
    }
  }
}
