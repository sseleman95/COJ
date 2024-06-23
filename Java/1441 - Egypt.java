import java.util.*;

public class coj {

  public static void main(String[] args) {
    int a, b, c;
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();

    while ((a != 0) && (b != 0) && (c != 0)) {
      if (
        (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2)) ||
        (Math.pow(a, 2) == Math.pow(c, 2) + Math.pow(b, 2)) ||
        (Math.pow(b, 2) == Math.pow(c, 2) + Math.pow(a, 2))
      ) {
        System.out.println("right");
      } else {
        System.out.println("wrong");
      }

      a = sc.nextInt();
      b = sc.nextInt();
      c = sc.nextInt();
    }
  }
}
