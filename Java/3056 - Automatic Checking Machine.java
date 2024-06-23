import java.util.*;

public class COJ1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean[] c1, c2;
    int i;
    boolean nocompatibles = false;

    c1 = new boolean[5];
    c2 = new boolean[5];

    while (sc.hasNext()) {
      nocompatibles = false;
      for (i = 0; i < 5; i++) c1[i] = (sc.nextInt() == 1);
      for (i = 0; i < 5; i++) c2[i] = (sc.nextInt() == 1);
      for (i = 0; i < 5; i++) if (c1[i] == c2[i]) {
        nocompatibles = true;
        break;
      }
      if (nocompatibles) {
        for (i = 0; i < 5; i++) if (c1[i] == c2[5 - 1 - i]) {
          nocompatibles = true;
          break;
        }
      }
      System.out.println((nocompatibles) ? "N" : "Y");
    }
  }
}
