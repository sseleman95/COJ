import java.util.Scanner;

public class JavaApplication1 {

  public static void main(String[] args) {
    Scanner entradaEscaner = new Scanner(System.in);
    float b = 0;
    for (int i = 1; i <= 12; i++) {
      float a = entradaEscaner.nextFloat();
      b = b + a;
    }
    System.out.println("$" + String.format("%.2f", b / 12));
  }
}
