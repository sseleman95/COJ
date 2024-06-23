import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    Scanner l = new Scanner(System.in);
    int k = 0;
    int a = l.nextInt();
    for (int i = 0; i < a; i++) {
      int x = l.nextInt();
      String b = Integer.toString(x, 2);
      for (int j = 0; j < b.length(); j++) {
        if (b.charAt(j) == '1') {
          k++;
        }
      }
    }
    System.out.println(k);
  }
}
