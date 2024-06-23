import java.util.*;

public class COJ1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    while (!s.equals("END")) {
      if (s.equals("1")) System.out.println("1"); else if (
        s.length() < 2 && !s.equals("1")
      ) System.out.println("2"); else if (s.length() < 10) System.out.println(
        "3"
      ); else System.out.println("4");

      s = sc.next();
    }
  }
}
