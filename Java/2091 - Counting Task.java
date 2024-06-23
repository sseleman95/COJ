import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    Scanner l = new Scanner(System.in);
    int a = l.nextInt();
    for (int x = 0; x < a; x++) {
      String s = l.next();
      int cont = 0;
      int r = 0;
      for (int i = 0; i < s.length(); i++) {
        for (int j = i + 1; j < s.length(); j++) {
          if (s.charAt(i) == s.charAt(j)) {
            r++;
          }
        }
        if (r == 0) {
          cont++;
        }
        r = 0;
      }
      System.out.println(cont);
    }
  }
}
