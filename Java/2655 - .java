import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AVION {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    List<Integer> lista = new ArrayList<>();
    boolean band = false;
    for (int i = 0; i < 5; i++) {
      String cadena = br.readLine();
      for (int j = 0; j < cadena.length() - 2; j++) {
        if (cadena.charAt(j) == 'F') {
          if (cadena.charAt(j + 1) == 'B') {
            if (cadena.charAt(j + 2) == 'I') {
              band = true;
              lista.add(i + 1);
            }
          }
        }
      }
    }
    if (band == true) {
      String nueva = "";
      int cont = 0;
      for (int j = 0; j < lista.size(); j++) {
        if (cont == lista.size() - 1) {
          nueva += lista.get(j);
        } else {
          nueva += lista.get(j) + " ";
        }
        cont++;
      }
      System.out.println(nueva);
    } else {
      System.out.println("HE GOT AWAY!");
    }
  }
}
