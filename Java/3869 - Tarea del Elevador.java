import java.util.Scanner;

public class JavaApplication7 {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int con, t = entrada.nextInt();
    int[] ord = new int[t];
    for (int i = 0; i < t; i++) {
      ord[i] = entrada.nextInt();
    }

    int p1 = ord[0] - 1;

    for (int i = 0; i < t - 1; i++) {
      if (ord[i] > ord[i + 1]) {
        con = ord[i] - ord[i + 1];
      } else {
        con = ord[i + 1] - ord[i];
      }
      p1 = p1 + con;
    }
    p1 = p1 + ((ord[t - 1]) - 1);
    System.out.println(p1);
  }
}
