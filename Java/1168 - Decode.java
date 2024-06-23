import java.util.Scanner;

public class main {

  public static void main(String[] arg) {
    Scanner Lee = new Scanner(System.in);

    String frase1, frase2;

    int desplazamiento;

    frase2 = "";

    String min = "abcdefghijklmnopqrstuvwxyz ";
    String may = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";

    System.out.print("Introduce una frase: ");
    frase1 = Lee.nextLine();

    System.out.print("Introduce la clave de desplazamiento: ");
    desplazamiento = Lee.nextInt();

    for (int i = 0; i < frase1.length(); i++) {
      for (int j = 0; j < min.length(); j++) {
        if (frase1.charAt(i) == min.charAt(j)) {
          if (j + desplazamiento >= min.length()) {
            frase2 += min.charAt((j + desplazamiento) % min.length());
          } else {
            frase2 += min.charAt(j + desplazamiento);
          }
        } else if (frase1.charAt(i) == may.charAt(j)) {
          if (j + desplazamiento >= may.length()) {
            frase2 += may.charAt((j + desplazamiento) % may.length());
          } else {
            frase2 += may.charAt(j + desplazamiento);
          }
        }
      }
    }
    System.out.println(frase1);
    System.out.println(frase2);
  }
}
