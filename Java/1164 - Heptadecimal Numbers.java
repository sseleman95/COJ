import java.io.*;
import java.io.BufferedReader;
import java.util.Scanner;

public class HeptadecimalNumbers {

  public static void main(String[] args) {
    InputStreamReader input;
    BufferedReader lector;
    String x, y;
    Scanner l = new Scanner(System.in);
    input = new InputStreamReader(System.in);
    x = l.next();
    y = l.next();

    while (x.charAt(0) != '*' && y.charAt(0) != '*') {
      long a = Long.parseLong(x, 17);
      long b = Long.parseLong(y, 17);
      if (a > b) {
        System.out.println(">");
      }
      if (a < b) {
        System.out.println("<");
      }
      if (a == b) {
        System.out.println("=");
      }
      x = l.next();
      y = l.next();
    }
  }
}
