import java.util.Scanner;

public class P2380 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] numbers = null;
    int checksum = 0;
    short lines = sc.nextShort();

    numbers = new int[lines];

    for (int i = 0; i < lines; i++) {
      numbers[i] = sc.nextInt();
    }

    for (int n : numbers) {
      char[] s = Integer.toBinaryString(n).toCharArray();

      for (char digit : s) {
        if (digit == '1') {
          checksum++;
        }
      }
    }

    System.out.println(checksum);
  }
}
