import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class JavaApplication2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sum = 0, n = sc.nextInt();
    LinkedList<Integer> imp = new LinkedList<Integer>();
    for (int i = 0; i < n; i++) {
      int Ci = sc.nextInt();

      if (Ci % 2 != 0) {
        imp.add(Ci);
      }
      sum += Ci;
    }
    if (sum % 2 == 0) {
      if (imp.size() == 0) {
        System.out.println(-1);
      } else {
        Collections.sort(imp);
        System.out.println(sum - imp.get(0));
      }
    } else {
      System.out.println(sum);
    }
  }
}
