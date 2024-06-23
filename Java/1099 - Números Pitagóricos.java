import java.util.Scanner;

public class JavaApplication2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();
    while (n1 != 0) {
      if ((n1 > n2) && (n1 > n3)) {
        if ((n1 * n1) == (n2 * n2) + (n3 * n3)) {
          System.out.println("right");
        } else {
          System.out.println("wrong");
        }
      }
      if ((n2 > n1) && (n2 > n3)) {
        if ((n2 * n2) == (n1 * n1) + (n3 * n3)) {
          System.out.println("right");
        } else {
          System.out.println("wrong");
        }
      }
      if ((n3 > n1) && (n3 > n2)) {
        if ((n3 * n3) == (n2 * n2) + (n1 * n1)) {
          System.out.println("right");
        } else {
          System.out.println("wrong");
        }
      }

      n1 = sc.nextInt();
      if (n1 == 0) {
        break;
      }
      n2 = sc.nextInt();
      n3 = sc.nextInt();
    }
  }
}
