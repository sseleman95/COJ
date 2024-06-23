import java.util.*;

public class coj {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Double t = sc.nextDouble();

    for (int i = 0; i < t; i++) {
      Double a = sc.nextDouble();
      Double s = sc.nextDouble();

      System.out.printf("%.2f\n", Math.sqrt(Math.pow(s, 2) - (4 * a)) / 2);
    }
  }
}
