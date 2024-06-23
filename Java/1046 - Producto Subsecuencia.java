import java.util.*;

public class COJ2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      int a = sc.nextInt(), b = sc.nextInt();
      long suma = 0;
      for (int j = a; j <= b; j++) {
        suma += j * (j + 1) * (j + 2);
      }

      if (suma < 99) {
        System.out.println(suma);
      } else {
        System.out.println(suma % 100);
      }
    }
  }
}
