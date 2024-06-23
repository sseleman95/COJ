import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class EvanMoneyLesson {

  public static void main(String[] args) {
    ArrayList<Lista> list = new ArrayList<Lista>();
    Scanner l = new Scanner(System.in);
    String nombre;
    int n, a = 5, b = 10, c = 20, a1, a2, a3, total;
    n = l.nextInt();
    while (n != -1) {
      while (n > 0) {
        nombre = l.next();
        a1 = l.nextInt();
        a1 *= a;
        a2 = l.nextInt();
        a2 *= b;
        a3 = l.nextInt();
        a3 *= c;
        total = a1 + a2 + a3;
        list.add(new Lista(nombre, total));
        n--;
      }

      Comparator<Lista> comparador = new Comparator<Lista>() {
        public int compare(Lista a, Lista b) {
          int resultado = Integer.compare(a.total(), b.total());

          return resultado;
        }
      };

      Collections.sort(list, comparador);
      if (list.get(0).total == list.get(list.size() - 1).total) {
        System.out.println("All have the same amount.");
      } else {
        System.out.println(
          list.get(list.size() - 1).nombre +
          " has most, " +
          list.get(0).nombre +
          " has least money."
        );
      }

      list.clear();
      n = l.nextInt();
    }
  }
}

class Lista {

  String nombre;
  int total;

  public Lista(String nombre, int total) {
    this.nombre = nombre;
    this.total = total;
  }

  public String nombre() {
    return nombre;
  }

  public int total() {
    return total;
  }
}
