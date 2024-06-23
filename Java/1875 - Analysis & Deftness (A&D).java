import java.util.Scanner;

public class JavaApplication16 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      int r = sc.nextInt();
      double at = (Math.pow(r, 2) * Math.sqrt(3)) / 4;
      System.out.printf("%.2f\n", at * 6);
    }
  }
}
