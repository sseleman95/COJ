import java.util.Scanner;

public class EnteringBar {

  public static void main(String[] args) {
    String comprobar[] = {
      "VODKA",
      "ABSINTH",
      "BEER",
      "BRANDY",
      "CHAMPAGNE",
      "GIN",
      "RUM",
      "SAKE",
      "TEQUILA",
      "VODKA",
      "WHISKEY",
      "WINE",
      "1",
      "2",
      "3",
      "4",
      "5",
      "6",
      "7",
      "8",
      "9",
      "10",
      "11",
      "12",
      "13",
      "14",
      "15",
      "16",
      "17",
      "0",
    };
    Scanner l = new Scanner(System.in);
    int a = l.nextInt(), b;
    String s = "";
    int cont = 0;
    boolean v = true;
    while (a-- > 0) {
      b = l.nextInt();
      for (int i = 0; i < b; i++) {
        s = l.next();
        for (int j = 0; j < comprobar.length; j++) {
          if (s.equals(comprobar[j])) {
            v = false;
            break;
          }
        }
        if (!v) {
          cont++;
        }
        v = true;
      }
      System.out.println(cont);
      v = true;
      cont = 0;
    }
  }
}
