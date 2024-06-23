import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    Scanner l = new Scanner(System.in);
    while (l.hasNext()) {
      String s = l.next();
      String p = l.next();
      int j;

      if (s.equals(p)) {
        System.out.println("Yes");
      } else {
        int cont = 0;
        int pos = 0;
        for (int i = 0; i < s.length(); i++) {
          for (j = pos; j < p.length(); j++) {
            if (s.charAt(i) == p.charAt(j)) {
              cont++;
              p.replaceAll("" + p.charAt(j), "*");
              break;
            }
          }
          pos = j;
        }
        if (cont == s.length()) {
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }
      }
    }
  }
}
