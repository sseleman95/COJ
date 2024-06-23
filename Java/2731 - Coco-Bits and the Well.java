import java.util.Scanner;

public class JavaApplication16 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    for (int i = 0; i < t; i++) {
      double l = sc.nextDouble();

      double asm = (l * l) - (Math.PI * Math.pow(l / 2, 2));
      System.out.printf("%.2f" + "\n", asm);
    }
  }
}
