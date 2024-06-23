import java.util.Scanner;

public class JavaApplication1 {

  public static void main(String[] args) {
    Scanner entradaEscaner = new Scanner(System.in);
    int n;
    n = entradaEscaner.nextInt();
    if (n == 0) {
      System.out.println(1);
    }
    if (n > 0) {
      System.out.println(n * (n + 1) / 2);
    }
    if (n < 0) {
      n = -n;
      System.out.println(-(n * (n + 1) / 2 - 1));
    }
  }
}
