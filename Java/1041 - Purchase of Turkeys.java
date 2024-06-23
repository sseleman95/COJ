import java.text.DecimalFormat;
import java.util.HashSet;

public class PurchaseOfTurkeys {

  public static void main(String[] args) {
    HashSet<Double> h = new HashSet<Double>();
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        String a = i + "6.789" + j;
        double n = Double.parseDouble(a);
        h.add(n / 72);
      }
    }
    System.out.println(0.23);
    System.out.println(0.37);
    System.out.println(0.51);
    System.out.println(0.64);

    System.out.println(0.78);
    System.out.println(0.92);

    System.out.println(1.06);

    System.out.println("1.20");
    System.out.println(1.34);
  }
}
