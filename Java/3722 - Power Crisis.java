import java.util.ArrayList;
import java.util.Scanner;

public class PowerCrisis_3722 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = 1;

    while (num != 0) {
      num = sc.nextInt();
      for (int i = 1; i < num * 3; i++) {
        ArrayList al = new ArrayList();
        int j = 1;
        int count = 1;
        int is_ready = 0;
        int last = 0;
        al.add(1);
        while (j <= num) {
          if (al.contains(j)) {
            j++;
          } else {
            is_ready++;
            if (is_ready == i) {
              al.add(j);
              last = j;
              is_ready = 0;
              count++;
            }
            j++;
          }
          if (count == num) {
            break;
          }

          if (j > num) {
            j = j - num;
          }
        }
        if (last == 13) {
          System.out.println(i);
          break;
        }
      }
    }
  }
}
