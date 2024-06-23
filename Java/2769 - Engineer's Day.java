import java.util.Scanner;

public class JavaApplication5 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      System.out.println(i + ": I am participating in the Engineer's day.");
    }
  }
}
