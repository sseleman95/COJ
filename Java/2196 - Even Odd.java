import java.math.BigInteger;
import java.util.Scanner;

public class JavaApplication13 {

  public static void main(String[] args) {
    Scanner sc = new java.util.Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      BigInteger l = sc.nextBigInteger();

      if (l.mod(new BigInteger("2")).equals(new BigInteger("0"))) {
        System.out.println("even");
      } else {
        System.out.println("odd");
      }
    }
  }
}
