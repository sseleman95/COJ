import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    Scanner l = new Scanner(System.in);
    Double a = l.nextDouble();
    double x = 5;
    double y = 6;
    double z = (x / y);
    System.out.println(z);
    int cont = 1;
    if (z < a) {
      for (int i = 1; i < i + 1; i++) {
        y++;
        z += (1 / (y));
        cont++;
        System.out.println(y);
        System.out.println(z);
        if (z >= a) {
          break;
        }
      }
    }
    System.out.println(cont);
  }
}
