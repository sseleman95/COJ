import java.util.Scanner;

public class TobyAndStrangeFunction {

  public static void main(String[] args) {
    Scanner l = new Scanner(System.in);
    int a = l.nextInt();
    int b;
    String s;
    while (a-- > 0) {
      String k = l.next();
      b = Integer.parseInt(k);
      s = l.next();
      if (s.length() > b) {
        for (int i = (s.length() - b); i < s.length(); i++) {
          System.out.print(s.charAt(i));
        }
        for (int i = 0; i < (s.length() - b); i++) {
          System.out.print(s.charAt(i));
        }
        System.out.println("");
      } else {
        System.out.println(s);
      }
    }
  }
}
