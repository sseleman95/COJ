import java.util.ArrayList;
import java.util.Scanner;

public class UnearthingTreasures {

  public static void main(String[] args) {
    ArrayList<Integer> lista = new ArrayList<>();
    ArrayList<Integer> lista2 = new ArrayList<>();
    Scanner l = new Scanner(System.in);
    int p = l.nextInt();
    int q = l.nextInt();
    for (int i = 1; i <= p; i++) {
      if (p % i == 0) {
        lista.add(i);
      }
    }
    for (int i = 1; i <= q; i++) {
      if (q % i == 0) {
        lista2.add(i);
      }
    }
    for (int i = 0; i < lista.size(); i++) {
      for (int j = 0; j < lista2.size(); j++) {
        System.out.println(lista.get(i) + " " + lista2.get(j));
      }
    }
  }
}
