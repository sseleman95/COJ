import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ZerosAndOnesII {

  public static void main(String[] args) {
    Scanner l = new Scanner(System.in);
    ArrayList<String> lista = new ArrayList<String>();
    int cont = 1;
    boolean b = true;
    int n;
    int arreglo[] = new int[2];
    String s, s1, s2 = "";
    while (l.hasNext()) {
      s = l.next();
      n = l.nextInt();
      for (int h = 0; h < n; h++) {
        s2 = "";
        arreglo[0] = l.nextInt();
        arreglo[1] = l.nextInt();

        Arrays.sort(arreglo);

        s1 = s.charAt(arreglo[0]) + "";
        for (int k = arreglo[0]; k <= arreglo[1]; k++) {
          s2 += s.charAt(k) + "";
        }

        if (s1.equals("0")) {
          if (s2.indexOf("1") == -1) {
            lista.add("YES");
          } else {
            lista.add("NO");
          }
        }
        if (s1.equals("1")) {
          if (s2.indexOf("0") == -1) {
            lista.add("YES");
          } else {
            lista.add("NO");
          }
        }
      }
      System.out.println("Case" + " " + cont + ":");
      for (int g = 0; g < lista.size(); g++) {
        System.out.println(lista.get(g));
      }
      lista.clear();
      cont++;
    }
  }
}
