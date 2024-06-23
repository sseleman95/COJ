import java.util.*;

public class COJ2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      if (
        (a + b == c) ||
        (a - b == c) ||
        (a * b == c) ||
        (b != 0 && ((a / b == c) || (a % b == c)))
      ) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}
