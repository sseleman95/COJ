import java.util.Scanner;

public class NumberSteps {

  public static void main(String[] args) {
    Scanner l = new Scanner(System.in);
    int n = l.nextInt();
    int x, y;
    for (int i = 0; i < n; i++) {
      x = l.nextInt();
      y = l.nextInt();
      if (
        (x % 2 == 0 && y % 2 == 0 && y >= x - 2 && y <= x + 2) ||
        (x % 2 != 0 && y % 2 != 0 && y >= x - 2 && y <= x + 2)
      ) {
        if (x % 2 == 0 && y % 2 == 0) {
          System.out.println(x + y);
        }
        if (x % 2 != 0 && y % 2 != 0) {
          System.out.println((x + y) - 1);
        }
      } else {
        System.out.println("No Number");
      }
    }
  }
}
