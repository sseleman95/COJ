import java.text.DecimalFormat;
import java.util.Scanner;

public class Bamboo {

  public static void main(String[] args) {
    Scanner l = new Scanner(System.in);
    DecimalFormat formateador = new DecimalFormat("0.0");
    int a = l.nextInt();
    double b = a;
    double altura;
    double base;
    double cuadrado;
    double doble;
    double cuadrado2;
    double resultado;
    double promedio = 0;
    while (a-- > 0) {
      altura = l.nextDouble();
      base = l.nextDouble();
      cuadrado = Math.pow(altura, 2);

      doble = altura * 2;

      cuadrado2 = Math.pow(base, 2);

      resultado = ((cuadrado + cuadrado2) / doble);
      resultado = Math.sqrt(Math.pow(resultado, 2) - cuadrado2);
      promedio += resultado;
      System.out.println(formateador.format((resultado)));
      if (a == 0) {
        promedio /= b;
        System.out.println(formateador.format((promedio)));
      }
    }
  }
}
