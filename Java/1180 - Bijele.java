import java.util.Scanner;

public class JavaApplication2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      int rey = sc.nextInt(), rei = sc.nextInt(), t = sc.nextInt(), a = sc.nextInt(), c = sc.nextInt(), p = sc.nextInt();

      System.out.println(
        (1 - rey) +
        " " +
        (1 - rei) +
        " " +
        (2 - t) +
        " " +
        (2 - a) +
        " " +
        (2 - c) +
        " " +
        (8 - p)
      );
    }
  }
}
