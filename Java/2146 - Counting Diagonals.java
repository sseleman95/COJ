import java.util.*;

public class COJ2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
    long d = Long.parseLong(st.nextToken());
    long v = Long.parseLong(st.nextToken());
    long result = ((v * (v - 3)) / 2);

    if (d == result) {
      System.out.println("yes");
    } else {
      System.out.println("no");
    }
  }
}
