import java.util.Scanner;

public class LasFrasesDeNaebbirac {

  public static void main(String[] args) {
    Scanner l = new Scanner(System.in);
    int a = l.nextInt();
    while (a-- != 0) {
      String s = l.next();
      String s2 = l.next();
      int cambios = 0;

      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) != s2.charAt(i)) {
          cambios++;
        }
      }
      System.out.println(cambios);
    }
  }
}
