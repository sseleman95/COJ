import java.util.Arrays;
import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    Scanner l = new Scanner(System.in);

    while (true) {
      double r = 0;
      int[] arreglo = new int[6];
      for (int i = 0; i < 6; i++) {
        arreglo[i] = l.nextInt();
      }

      if (
        arreglo[0] == 0 &&
        arreglo[1] == 0 &&
        arreglo[2] == 0 &&
        arreglo[3] == 0 &&
        arreglo[4] == 0 &&
        arreglo[5] == 0
      ) {
        break;
      }
      Arrays.sort(arreglo);
      arreglo[0] = 0;
      arreglo[5] = 0;
      for (int i = 0; i < 6; i++) {
        r += arreglo[i];
      }
      r /= 4;

      if (r % 1 == 0) {
        System.out.println((int) r);
      } else {
        System.out.println(r);
      }
    }
  }
}
