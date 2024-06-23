import java.util.Arrays;
import java.util.Scanner;

public class main {

  public static void main(String[] arg) {
    Scanner l = new Scanner(System.in);
    int a = l.nextInt();
    do {
      boolean t = true;
      int[] b = new int[a];
      for (int c = 0; c < a; c++) b[c] = l.nextInt();
      Arrays.sort(b);
      for (int k = 0; k < a - 1; k++) {
        if (b[k] - b[k + 1] < -200) {
          System.out.println("IMPOSSIBLE");
          t = false;
          break;
        }
      }
      if (t) {
        int resta = 1442 - b[a - 1];
        if (resta < 200) {
          resta = 200 - resta;
          resta = 1442 - resta;
          if (resta <= b[a - 1]) System.out.println(
            "POSSIBLE"
          ); else System.out.println("IMPOSSIBLE");
        } else System.out.println("IMPOSSIBLE");
      }

      a = l.nextInt();
    } while (a != 0);
  }
}
