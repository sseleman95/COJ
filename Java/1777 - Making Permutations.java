import java.util.*;

public class COJ1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    HashSet<Integer> total = new HashSet<>();

    int n = sc.nextInt(), cont = 0;

    for (int i = 0; i < n; i++) {
      int a = sc.nextInt();

      if (a > n) {
        cont++;
      }
      total.add(a);
    }

    System.out.println((n - total.size()) + cont);
  }
}
