import java.util.Scanner;

public class JavaApplication16 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt(), cont = 0;
    while (l != -1) {
      String bi = Integer.toString(l, 3);

      System.out.println(bi);
      l = sc.nextInt();
    }
  }
}
