import java.util.Scanner;

public class NamingTowers {

  public static void main(String[] args) {
    Scanner l = new Scanner(System.in);
    String s, s2 = "", s3 = "";
    boolean c = true;
    int a = l.nextInt();
    int b = a;
    while (a-- > 0) {
      if (a == b - 1) {
        s = l.nextLine();
      }
      s = l.nextLine();
      for (int i = s.length() - 1; i >= 0; i--) {
        if (s.charAt(i) != ' ') {
          s3 += s.charAt(i);
        }
      }
      for (int i = s3.length() - 1; i >= 0; i--) {
        if (s3.charAt(i) > 96) {
          c = false;
          break;
        } else {
          s2 += s3.charAt(i) + "";
        }
      }
      if (s3.equals(s2) && c) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }

      s2 = "";
      s3 = "";
      c = true;
    }
  }
}
