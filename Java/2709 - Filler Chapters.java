import java.util.HashSet;
import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    Scanner l = new Scanner(System.in);
    HashSet<Integer> relleno = new HashSet<Integer>();
    int a = l.nextInt();

    int b = l.nextInt();
    for (int i = 0; i < b; i++) {
      relleno.add(l.nextInt());
    }
    System.out.println(a - relleno.size());
  }
}
