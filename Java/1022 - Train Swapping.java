import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    Scanner l = new Scanner(System.in);
    int a = l.nextInt();
    for (int o = 0; o < a; o++) {
      int b = l.nextInt();
      int arreglo[] = new int[b];
      for (int i = 0; i < arreglo.length; i++) {
        arreglo[i] = l.nextInt();
      }
      int cont = 0;
      for (int i = 0; i < arreglo.length; i++) {
        for (int j = i + 1; j < arreglo.length; j++) {
          if (arreglo[i] > arreglo[j]) {
            int aux = arreglo[i];
            arreglo[i] = arreglo[j];
            arreglo[j] = aux;
            cont++;
          }
        }
      }

      System.out.println("Optimal train swapping takes " + cont + " swaps.");
    }
  }
}
