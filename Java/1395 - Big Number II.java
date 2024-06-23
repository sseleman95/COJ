import java.util.ArrayList;
import java.util.Scanner;

class main {

  public static void main(String[] args) {
    Scanner Lee = new Scanner(System.in);
    ArrayList<Integer> total = new ArrayList<Integer>();
    long factorial = 1;
    Scanner l = new Scanner(System.in);

    int b = l.nextInt();

    for (int j = 0; j < b; j++) {
      int x;
      long a = l.nextLong();
      for (long i = a; i > 1; i--) {
        factorial = factorial * i;
      }
      String s = "";

      s = Long.toString(factorial);
      x = s.length();
      if (s.charAt(0) == '-') {
        x -= 1;
      }
      total.add(x);
    }
    for (int j = 0; j < total.size(); j++) {
      System.out.println(total.get(j));
    }
  }
}
