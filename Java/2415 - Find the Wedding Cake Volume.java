import java.util.Scanner;

public class JavaApplication16 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    double v = 0, ar = 0, vt = 0;
    for (int i = 0; i < t; i++) {
      int p = sc.nextInt();
      for (int j = 0; j < p; j++) {
        v = 0;
        ar = 0;

        int r = sc.nextInt(), al = sc.nextInt();

        ar = Math.PI * Math.pow(r, 2);
        v = ar * al;
        vt = vt + v;
      }
      System.out.printf("%.2f\n", vt);
      vt = 0;
    }
  }
}
