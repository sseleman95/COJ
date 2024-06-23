import java.math.BigDecimal;
import java.text.DecimalFormat;

public class UCalculateE {

  public static void main(String[] args) {
    double n = 0;
    DecimalFormat formateador = new DecimalFormat("0.000000000");

    System.out.println("n e");
    System.out.println("- -----------");
    for (int i = 0; i < 10; i++) {
      n += 1 / factorial(i);

      if (i < 2) {
        System.out.println(i + " " + (i + 1));
      }
      if (i == 2) {
        System.out.println(i + " " + n);
      }
      if (i >= 3) {
        System.out.println(i + " " + formateador.format(n));
      }
    }
  }

  static double factorial(double n) {
    if (n == 0 || n == 1) return 1.0;
    double fact = 1.0;
    for (int i = 2; i <= n; i++) {
      fact *= (double) i;
    }
    return fact;
  }
}
