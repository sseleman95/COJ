import java.util.*;

public class COJ2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      int m = sc.nextInt();
      int d = sc.nextInt();
      System.out.println(d - (d / m));
    }
  }
}
