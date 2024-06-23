import java.util.ArrayList;
import java.util.Scanner;

public class main {

  public static void main(String arg[]) {
    Scanner l = new Scanner(System.in);
    ArrayList<String> total = new ArrayList<String>();
    int i, j;
    int a = l.nextInt();
    for (int h = 0; h < a; h++) {
      boolean esPrimo;
      int rInicial = l.nextInt();
      int rFinal = l.nextInt();
      if (rInicial <= 1) {
        rInicial = rInicial + 1;
      }
      for (i = rInicial; i <= rFinal; i++) {
        esPrimo = true;
        for (j = 2; j < i; j++) {
          if (i % j == 0) {
            esPrimo = false;
          }
        }
        if (esPrimo) {
          total.add("" + i);
        }
      }
      total.add("");
    }
    for (i = 0; i < total.size(); i++) {
      System.out.println(total.get(i));
    }
  }
}
