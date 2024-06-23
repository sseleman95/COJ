import java.util.*;

public class COJ2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.nextLine();

    int dias = s.length();
    int pos = 0;
    int per = 1;
    while (pos != s.length()) {
      char c;
      switch (per) {
        case 1:
          c = 'P';
          per++;
          break;
        case 2:
          c = 'E';
          per++;
          break;
        default:
          c = 'R';
          per = 1;
          break;
      }
      if (c == s.charAt(pos)) {
        dias--;
      }
      pos++;
    }
    System.out.println(dias);
  }
}
