import java.util.Scanner;

public class P1066 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    final double PI = 3.141592653589793;

    int testCases = sc.nextInt();

    for (int i = 0; i < testCases; i++) {
      double R = sc.nextDouble();
      byte N = sc.nextByte();

      double inscribed_perimeter = 2 * N * R * Math.sin(PI / N);
      double circumscribed_perimeter = 2 * N * R * Math.tan(PI / N);

      System.out.format(
        "%.4f %.4f\n",
        inscribed_perimeter,
        circumscribed_perimeter
      );
    }
  }
}
