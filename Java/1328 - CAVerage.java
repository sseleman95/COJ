import java.util.Scanner;

public class CAVerage {

  public static void main(String[] args) {
    Scanner l = new Scanner(System.in);
    double matematicas[];
    double fisica[];
    int a = l.nextInt();
    int contador = 0;
    double promedio = 0.0;
    while (a-- > 0) {
      int b = l.nextInt();
      matematicas = new double[b];
      fisica = new double[b];
      b *= 2;
      for (int i = 0; i < b / 2; i++) {
        matematicas[i] = l.nextDouble();
        promedio += matematicas[i];
      }
      for (int i = 0; i < b / 2; i++) {
        fisica[i] = l.nextDouble();
        promedio += fisica[i];
      }
      promedio /= b;

      for (int i = 0; i < matematicas.length; i++) {
        if ((matematicas[i] + fisica[i]) / 2.0 < promedio) {
          contador++;
        }
      }
      System.out.println(contador);
      contador = 0;
      promedio = 0;
    }
  }
}
