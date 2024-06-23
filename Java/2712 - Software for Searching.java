import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SoftwareForSearching {

  public static void main(String[] args) {
    Scanner l = new Scanner(System.in);
    ArrayList<String> lista1 = new ArrayList<>();
    ArrayList<String> lista2 = new ArrayList<>();

    StringTokenizer tokens;
    int cont = 0;
    int a = l.nextInt();
    String m;
    while (a-- >= 0) {
      m = l.nextLine();

      tokens = new StringTokenizer(m);
      while (tokens.hasMoreTokens()) {
        if (cont > 0) {
          lista1.add(tokens.nextToken());
        } else {
          tokens.nextToken();
        }
        cont++;
      }
      cont = 0;
    }

    a = l.nextInt();
    int arreglo[] = new int[a];
    while (a-- >= 0) {
      m = l.nextLine();

      tokens = new StringTokenizer(m);
      while (tokens.hasMoreTokens()) {
        if (cont > 0) {
          lista2.add(tokens.nextToken());
        } else {
          tokens.nextToken();
        }

        cont++;
      }
      cont = 0;
    }
    for (int i = 0; i < lista2.size(); i++) {
      for (int j = 0; j < lista1.size(); j++) {
        if (lista2.get(i).equals(lista1.get(j))) {
          arreglo[i]++;
        }
      }
      System.out.println(arreglo[i]);
    }
  }
}
