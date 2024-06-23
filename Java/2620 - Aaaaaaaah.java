import java.util.Scanner;

public class JavaApplication2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String a = "aaaa", c = "";
    for (int i = 0; i < n; i++) {
      c = c + a;
    }
    System.out.println("A" + (c) + "h");
  }
}
