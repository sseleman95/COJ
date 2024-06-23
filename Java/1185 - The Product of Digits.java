import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    Scanner l = new Scanner(System.in);
    int a = l.nextInt();
    int mul = 0;
    String s = "";
    boolean b = false;
    boolean n = false;
    if (a == 0) {
      System.out.println(-1);
      n = true;
    }
    for (int i = 1; i < 10; i++) {
      if (b) {
        break;
      }
      for (int j = 1; j < 10; j++) {
        if ((i * j) == a) {
          s += Integer.toString(i);
          s += Integer.toString(j);
          b = true;
          break;
        }
      }
    }
    if (b && !n) {
      System.out.println(s);
    }
    if (!b && !n) {
      System.out.println(-1);
    }
  }
}
