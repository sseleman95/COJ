import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    long a;
    long b;
    long r;
    Scanner l = new Scanner(System.in);
    a = l.nextLong();
    b = l.nextLong();

    r = (a / 2) * (a - 1) * b;

    System.out.print(r);
  }
}
