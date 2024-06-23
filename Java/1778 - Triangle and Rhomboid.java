import java.util.*;

public class coj {

  public static void main(String[] args) {
    double a, b, r, r1;
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    for (int i = 1; i <= N; i++) {
      a = sc.nextInt();
      b = sc.nextInt();

      r = ((a / 2) * (b / 2)) / 2;
      r1 = ((a / 2) * (b / 4)) / 2;

      System.out.printf("%.8f" + "\n", r + r1);
    }
  }
}
