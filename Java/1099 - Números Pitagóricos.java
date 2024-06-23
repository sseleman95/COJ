import java.util.*;

public class COJ1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String linea;
    StringTokenizer LeerLinea;
    short[] num = new short[3];

    linea = sc.nextLine();
    while (!linea.equals("0")) {
      LeerLinea = new StringTokenizer(linea);
      num[0] = Short.parseShort(LeerLinea.nextToken());
      num[1] = Short.parseShort(LeerLinea.nextToken());
      num[2] = Short.parseShort(LeerLinea.nextToken());
      Arrays.sort(num);

      if (
        num[0] * num[0] + num[1] * num[1] == num[2] * num[2]
      ) System.out.println("right"); else System.out.println("wrong");
      linea = sc.nextLine();
    }
  }
}
