import java.util.ArrayList;
import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> total = new ArrayList<String>();
    int a;

    do {
      int suma = 0;
      a = sc.nextInt();
      if (a != 0) {
        String b = Integer.toString(a, 2);
        for (int i = 0; i < b.length(); i++) {
          suma += Integer.parseInt("" + b.charAt(i));
        }
        total.add("The parity of " + b + " is " + suma + " (mod 2).");
      }
    } while (a != 0);

    for (int i = 0; i < total.size(); i++) {
      System.out.println(total.get(i));
    }
  }
}
