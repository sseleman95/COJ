import java.util.*;

public class COJ1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String c = sc.next();
    int cp = 0, cn = 0;

    for (int i = 0; i < c.length(); i++) {
      if (c.charAt(i) == '-') {
        cn++;
      } else if (c.charAt(i) == '+') {
        cp++;
      }
    }
    cn = cn / 2;
    cp = cp / 2;
    System.out.println(cp - cn);
  }
}
