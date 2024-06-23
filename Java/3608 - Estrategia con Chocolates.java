import java.util.*;

public class COJ2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int caso, h, w;

    caso = sc.nextInt();

    for (int i = 0; i < caso; i++) {
      h = sc.nextInt();
      w = sc.nextInt();

      if (h == w) System.out.println("2"); else System.out.println("1");
    }
  }
}
