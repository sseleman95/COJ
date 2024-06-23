import java.util.*;

public class COJ1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = Integer.parseInt(sc.nextLine());

    String[] files = new String[2];
    files[0] = sc.nextLine();
    files[1] = sc.nextLine();

    String[] salida = { "Deletion succeeded", "Deletion failed" };

    boolean bien = true;

    if (n != 1 && n % 2 == 0) {
      for (int i = 0; i < files[0].length(); i++) {
        if (files[0].charAt(i) != files[1].charAt(i)) {
          bien = false;
          break;
        }
      }
    } else {
      for (int i = 0; i < files[0].length(); i++) {
        if (files[0].charAt(i) == files[1].charAt(i)) {
          bien = false;
          break;
        }
      }
    }

    if (bien) {
      System.out.println(salida[0]);
    } else {
      System.out.println(salida[1]);
    }
  }
}
