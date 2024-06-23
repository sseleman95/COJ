import java.util.*;

public class COJ2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] nums = {
      "one",
      "two",
      "three",
      "four",
      "five",
      "six",
      "seven",
      "eight",
      "nine",
      "ten",
      "eleven",
      "twelve",
    };

    int t = sc.nextInt();
    int k = 0;

    for (int i = 0; i < t; i++) {
      k = sc.nextInt();
      System.out.println(nums[k - 1]);
    }
  }
}
