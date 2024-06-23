import java.util.Scanner;

public class main {

  public int factorial(int x) {
    if (x == 0) {
      return 1;
    } else {
      return x * factorial(x - 1);
    }
  }

  public static void main(String[] args) {
    Scanner l = new Scanner(System.in);
    main m = new main();
    String s = l.next();
    while (!s.equals("0")) {
      int j = 0;
      int resultado = 0;
      int x = s.length();
      for (int i = x; i >= 1; i--) {
        resultado += (s.charAt(j) - '0') * m.factorial(i);

        j++;
      }
      System.out.println(resultado);
      s = l.next();
    }
  }
}
