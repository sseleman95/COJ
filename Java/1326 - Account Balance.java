import java.util.*;

public class COJ1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = Integer.parseInt(sc.nextLine());

    for (int i = 0; i < t; i++) {
      int c = Integer.parseInt(sc.nextLine());
      int s = Integer.parseInt(sc.nextLine());

      for (int j = 0; j < s; j++) {
        String[] l = sc.nextLine().split(" ");
        int n = Integer.parseInt(l[1]);

        if (l[0].equals("C")) {
          c += n;
        } else {
          c -= n;
        }
      }
      System.out.println(c);
    }
  }
}
