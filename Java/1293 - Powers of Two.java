import java.math.BigInteger;
import java.util.Scanner;

public class JavaApplication8 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    if (n == 0) {
      System.out.println(1);
    }
    if (n == 1) {
      System.out.println(2);
    }
    if (n > 1) {
      System.out.println(new BigInteger("2").pow(n));
    }
  }
}
