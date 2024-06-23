import java.util.*;

public class COJ1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = 0;
    int t = 0;
    for (int i = 0; i < n; i++) {
      d += sc.nextInt();
      t += sc.nextInt();
    }
    System.out.println(d + " " + t + " " + d / t);
  }
}
