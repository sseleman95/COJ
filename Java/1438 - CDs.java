import java.util.HashSet;
import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    HashSet<Integer> discos = new HashSet<Integer>();
    Scanner l = new Scanner(System.in);
    int[] arreglo;
    int a = l.nextInt();
    int b = l.nextInt();
    while (a != 0 && b != 0) {
      a += b;
      arreglo = new int[a];

      for (int i = 0; i < a; i++) {
        arreglo[i] = l.nextInt();
      }
      for (int i = 0; i < a; i++) {
        discos.add(arreglo[i]);
      }
      if (discos.size() != 0) {
        System.out.println(arreglo.length - discos.size());
      } else {
        System.out.println(discos.size());
      }
      discos.clear();
      a = l.nextInt();
      b = l.nextInt();
    }
  }
}
