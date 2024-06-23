import java.util.Scanner;

public class JavaApplication16 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
      double a = sc.nextDouble();
      double p = 3.141592653589793;
      double ac = (p * Math.pow(a / 3, 2));
      double at = (((a / 3) * (a / 2)) / 2) * 4;
      double ans = ac + at;
      double acu = a * a;

      System.out.printf("%.4f\n", acu - ans);
    }
  }
}
