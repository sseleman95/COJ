import java.util.Scanner;

public class JavaApplication1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String cad = sc.next();
    char n[] = {
      'A',
      'B',
      'C',
      'D',
      'E',
      'F',
      'G',
      'H',
      'I',
      'J',
      'K',
      'L',
      'M',
      'N',
      'O',
      'P',
      'Q',
      'R',
      'S',
      'T',
      'U',
      'V',
      'W',
      'X',
      'Y',
      'Z',
    };
    int cont = 0;

    for (int i = 0; i < cad.length(); i++) {
      for (int j = 0; j < n.length; j++) {
        if (cad.charAt(i) == n[j]) {
          cont = cont + (j + 1);
        }
      }
    }
    System.out.println(cont);
  }
}
