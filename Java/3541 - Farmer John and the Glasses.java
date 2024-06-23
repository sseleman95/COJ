import java.util.*;

public class COJ2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int k = Integer.parseInt(sc.nextLine());

    for (int i = 0; i < k; i++) {
      String entrada = sc.nextLine();
      String salida = "";

      for (int j = 0; j < entrada.length(); j++) {
        char c = entrada.charAt(j);
        boolean esLetra = Character.isLetter(c);

        if (esLetra) {
          if (Character.isLowerCase(c)) {
            salida += "" + Character.toUpperCase(c);
          } else {
            salida += "" + Character.toLowerCase(c);
          }
        } else {
          salida += "" + c;
        }
      }
      System.out.println(salida);
    }
  }
}
