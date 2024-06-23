import java.util.Scanner;

public class BinariesPalindromes {

  int i;
  int j;
  int r;
  String palabra;
  String palabrareves;
  boolean v;

  public BinariesPalindromes() {
    i = 0;
    j = 0;
    palabra = "";
    palabrareves = "";
    r = 0;
    v = true;
  }

  public Long palindromo(Long num1) {
    palabrareves = "";
    palabra = Long.toString(num1, 2);
    r = palabra.length() - 1;
    v = true;
    while (r >= 0) {
      palabrareves += palabra.charAt(r);
      r--;
    }
    for (int p = 0; p < palabra.length(); p++) {
      if (palabra.charAt(p) != palabrareves.charAt(p)) {
        v = false;
      }
    }
    if (v) {
      return num1;
    } else {
      return null;
    }
  }

  public static void main(String[] args) {
    BinariesPalindromes b = new BinariesPalindromes();
    Scanner l = new Scanner(System.in);
    int a = l.nextInt();
    while (a > 0) {
      Long x = l.nextLong();
      Long x2 = l.nextLong();
      for (Long i = x; i <= x2; i++) {
        if (b.palindromo(i) != null) {
          System.out.print(b.palindromo(i) + " ");
        }
      }
      System.out.println();
      a--;
    }
  }
}
