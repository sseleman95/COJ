import java.util.ArrayList;
import java.util.Scanner;

public class UniqwordsComparison {

  public static void main(String[] args) {
    Scanner l = new Scanner(System.in);
    ArrayList<String> lista = new ArrayList<>();
    ArrayList<String> lista2 = new ArrayList<>();
    ArrayList<String> lista3 = new ArrayList<>();
    String a = l.next();
    String b = l.next();
    String first = "";
    String second = "";
    String ultimo = "";
    boolean c = true;
    for (int i = 0; i < a.length(); i++) {
      for (int j = 0; j < b.length(); j++) {
        if (a.charAt(i) == b.charAt(j)) {
          lista3.add("" + b.charAt(j));
          ultimo += "" + b.charAt(j);
          c = false;
        }
      }
      if (c) {
        lista.add("" + a.charAt(i));
        first += "" + a.charAt(i);
      }
      c = true;
    }
    for (int i = 0; i < b.length(); i++) {
      for (int j = 0; j < a.length(); j++) {
        if (b.charAt(i) == a.charAt(j)) {
          c = false;
        }
      }
      if (c) {
        lista2.add("" + b.charAt(i));
        second += "" + b.charAt(i);
      }
      c = true;
    }
    System.out.println("First:" + first);
    System.out.println("Second:" + second);
    System.out.println("First&Second:" + ultimo);
  }
}
