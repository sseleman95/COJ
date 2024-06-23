import java.math.*;
import java.util.*;

class Main {

  public static void main(String args[]) {
    int input;
    Scanner in = new Scanner(System.in);
    int[] arr = new int[502];

    arr[1] = 1;
    for (int i = 2; i < 502; i++) {
      arr[i] = i * i + (arr[i - 1]);
    }

    while ((input = in.nextInt()) != 0) {
      System.out.println(arr[input]);
    }
  }
}
