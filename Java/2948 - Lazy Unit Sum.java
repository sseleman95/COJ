import java.util.*;

public class COJ2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    for (int i = 0; i < t; i++) {
      String num = sc.next();

      int sum = 0;

      for (int j = 0; j < num.length(); j++) {
        sum += num.charAt(j) - '0';
      }

      while (sum >= 10) {
        int res = 0;
        int a = sum;
        while (a > 0) {
          res += a % 10;
          a /= 10;
        }
        sum = res;
      }
      System.out.println(sum);
    }
  }
}
