import java.util.Scanner;

public class JavaApplication3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      double l = sc.nextInt();
      double resp =
        (
          (Math.pow(l, 2)) -
          (((Math.pow(l, 2)) - ((3.14 * (Math.pow(l, 2))) / 4)) * 2)
        );
      System.out.printf("%.2f" + "\n", resp);
    }
  }
}
