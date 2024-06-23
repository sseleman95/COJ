import java.util.*;

public class COJ1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int cc = Integer.parseInt(sc.nextLine());

    for (int i = 0; i < cc; i++) {
      String cad = sc.nextLine();
      String tmp = "";

      for (int j = 0; j < cad.length(); j++) {
        char c = cad.charAt(j);

        if (Character.isUpperCase(c)) {
          tmp += Character.toLowerCase(c);
        } else {
          tmp += Character.toUpperCase(c);
        }
      }

      System.out.println(tmp);
    }
  }
}
