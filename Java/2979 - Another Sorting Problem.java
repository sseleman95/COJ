import java.util.*;

public class COJ1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      int a = sc.nextInt(), cont = 0;
      for (int j = 1; j <= a; j++) {
        if (j != sc.nextInt()) {
          cont++;
        }
      }
      System.out.println(cont);
    }
  }
}
