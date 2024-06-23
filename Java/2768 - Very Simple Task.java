import java.util.*;

public class COJ2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    while (x != 0) {
      System.out.println(t(x));
      x = sc.nextLong();
    }
  }

  public static long t(long b) {
    b++;
    long a = 2, mod = 1000000007;
    long res = 1;
    while (b > 0) {
      if ((b & 1) == 1) res = (a * res) % mod;
      b >>= 1;
      a = ((a) * (a)) % mod;
    }
    return res - 1;
  }
}
