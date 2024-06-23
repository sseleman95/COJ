import java.util.*;

public class COJ2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N;

    while (sc.hasNext()) {
      N = sc.nextInt();
      System.out.println(
        ((N * (N + 1) * (2 * N + 1)) / 6) +
        " " +
        ((N * N * (N + 1) * (N + 1)) / 4)
      );
    }
  }
}
