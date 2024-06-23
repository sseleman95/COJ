import java.util.*;

public class COJ2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int tc = Integer.parseInt(sc.nextLine());

    for (int i = 0; i < tc; i++) {
      String s = sc.nextLine(), salida = "";
      boolean primero = true;
      int repeticiones = 0;

      for (int j = 0; j < s.length(); j++) {
        if (primero) {
          repeticiones = Integer.parseInt(String.valueOf(s.charAt(j)));
          primero = false;
        } else {
          int num = Integer.parseInt(String.valueOf(s.charAt(j)));

          for (int k = 0; k < repeticiones; k++) {
            salida += num;
          }

          primero = true;
        }
      }

      System.out.println(salida);
    }
  }
}
