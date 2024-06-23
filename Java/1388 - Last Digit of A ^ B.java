import java.util.Scanner;

public class P1388 {

  private static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int cases = sc.nextInt();

    for (int i = 0; i < cases; i++) {
      byte a = sc.nextByte();
      int exp = sc.nextInt();

      if (exp == 0) {
        System.out.println(1);
      } else if (exp == 1) {
        System.out.println(a);
      } else {
        byte lastDigit = (byte) (a % 10);
        byte[] pattern = getLastDigitsPattern(lastDigit);

        byte remainder = (byte) ((exp - 1) % 4);
        byte index = (byte) ((remainder + 3) % 4);

        System.out.println(pattern[index]);
      }
    }
  }

  private static byte[] getLastDigitsPattern(byte n) {
    byte[] pattern = new byte[4];
    byte index = 0;

    for (int i = 2; i <= 5; i++) {
      int res = (int) Math.pow(n, i);
      pattern[index++] = (byte) (res % 10);
    }

    return pattern;
  }
}
