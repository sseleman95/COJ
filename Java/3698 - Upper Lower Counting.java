import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int upper = 0;
    int lower = 0;
    int n = in.nextInt();
    String str = in.next();

    for (int i = 0; i < str.length() && str.length() <= n; i++) {
      if (Character.isUpperCase(str.charAt(i))) {
        upper++;
      } else {
        lower++;
      }
    }
    System.out.println(upper + " " + lower);
  }
}
