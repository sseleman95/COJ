import java.util.*;

public class COJ2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt(), cont = 0;

    while (n != 0) {
      n /= 2;
      cont++;
    }
    System.out.println(cont);
  }
}
