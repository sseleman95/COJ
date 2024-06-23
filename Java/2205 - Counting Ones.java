import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    Scanner l = new Scanner(System.in);
    int k = 0;
    int a = l.nextInt();
    for (int i = 0; i < a; i++) {
      k = 0;
      int x = l.nextInt();
      int v = l.nextInt();
      for (int y = x; y <= v; y++) {
        String b = Integer.toString(y, 2);
        for (int j = 0; j < b.length(); j++) {
          if (b.charAt(j) == '1') {
            k++;
          }
        }
      }
      System.out.println(k);
    }
  }
}
