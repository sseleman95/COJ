import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class FinalStandings {

  public static void main(String[] args) {
    ArrayList<Equipos> list = new ArrayList<>();
    Scanner l = new Scanner(System.in);
    int num, resueltos;
    int a = l.nextInt();
    while (a-- > 0) {
      num = l.nextInt();
      resueltos = l.nextInt();
      list.add(new Equipos(num, resueltos));
    }
    Comparator<Equipos> comparador = new Comparator<Equipos>() {
      public int compare(Equipos a, Equipos b) {
        int resultado = Integer.compare(a.resueltos(), b.resueltos());
        if (resultado == 0) {
          return -1;
        }
        return resultado;
      }
    };

    Collections.sort(list, comparador);
    for (int u = list.size() - 1; u >= 0; u--) {
      System.out.println(list.get(u).num + " " + list.get(u).resueltos);
    }
    list.clear();
  }
}

class Equipos {

  int num, resueltos;

  public Equipos(int num, int resueltos) {
    this.num = num;
    this.resueltos = resueltos;
  }

  public int num() {
    return num;
  }

  public int resueltos() {
    return resueltos;
  }
}
