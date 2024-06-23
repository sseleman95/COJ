import java.util.Scanner;

public class Genetic {

  public static void main(String[] args) {
    Scanner l = new Scanner(System.in);
    int a = l.nextInt();
    String m, n;
    boolean c = false;
    boolean b = false;
    while (a-- > 0) {
      m = l.next();
      n = l.next();
      if (m.length() >= n.length()) {
        int resultado = m.indexOf(n);

        if (resultado != -1) {
          c = true;
        }
        for (int i = 0; i < m.length(); i++) {
          if (m.charAt(i) == 'T') {
            b = true;
            break;
          }
        }
        if (c && b) {
          System.out.println("Y");
        } else {
          System.out.println("N");
        }
      } else {
        System.out.println("N");
      }
      c = false;
      b = false;
    }
  }
}
