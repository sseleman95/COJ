import java.util.Scanner;

public class JavaApplication20 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    int d = sc.nextInt(), i = sc.nextInt();

    if (d < i) {
      System.out.println(s + " " + (i - d));
    } else {
      System.out.println(s + " " + (d - i));
    }
  }
}
