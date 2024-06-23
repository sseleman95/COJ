import java.util.Arrays;
import java.util.Scanner;

class kingsPoker {

  static int[] v = new int[3];
  static Scanner in;

  public static void main(String[] args) {
    in = new Scanner(System.in);
    while ((v[0] = in.nextInt()) != 0) {
      v[1] = in.nextInt();
      v[2] = in.nextInt();
      Arrays.sort(v);
      if (v[0] == v[1] && v[0] == v[2]) {
        if (v[0] == 13) System.out.println("*"); else System.out.println(
          (v[0] + 1) + " " + (v[0] + 1) + " " + (v[0] + 1)
        );
      } else if (v[0] == v[1]) {
        if (v[2] == 13) System.out.println(
          "1 " + (v[0] + 1) + " " + (v[0] + 1)
        ); else System.out.println(v[0] + " " + v[0] + " " + (v[2] + 1));
      } else if (v[1] == v[2]) {
        if (v[0] == v[1] - 1) {
          if (v[1] == 13) System.out.println("1 1 1"); else System.out.println(
            v[2] + " " + v[2] + " " + (v[0] + 2)
          );
        } else System.out.println((v[0] + 1) + " " + v[2] + " " + v[2]);
      } else System.out.println("1 1 2");
    }
    System.exit(0);
  }
}
