import java.util.Scanner;

public class P1132 {

  private static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int cases = sc.nextInt();

    for (int i = 0; i < cases; i++) {
      int n = sc.nextInt();
      int summation = 0;

      if (n > 1) {
        summation = 1;

        for (int j = 2; j <= Math.sqrt(n); j++) {
          if (n % j == 0) {
            summation += j;

            if (j != (n / j)) {
              summation += (n / j);
            }
          }
        }
      }

      System.out.println(summation);
    }
  }
}
