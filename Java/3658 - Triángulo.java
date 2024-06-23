import java.util.*;

public class coj {

  public static void main(String[] args) {
    int a, b, c, a1, b1, c1;
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    a1 = sc.nextInt();
    b1 = sc.nextInt();
    c1 = sc.nextInt();

    if (
      (
        (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) ||
        (Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2)) ||
        (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2))
      ) &&
      (
        (Math.pow(a1, 2) == Math.pow(b1, 2) + Math.pow(c1, 2)) ||
        (Math.pow(b1, 2) == Math.pow(a1, 2) + Math.pow(c1, 2)) ||
        (Math.pow(c1, 2) == Math.pow(a1, 2) + Math.pow(b1, 2))
      ) &&
      ((a == a1) || (a == b1) || (a == c1)) &&
      ((b == a1) || (b == b1) || (b == c1)) &&
      ((c == a1) || (c == b1) || (c == c1))
    ) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
