import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class COJ2 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    for (int i = 0; i < n; i++) {
      String[] list = br.readLine().split(" ");
      Double a = Double.parseDouble(list[0]), b = Double.parseDouble(list[1]);

      if (b != 0) {
        double r = a / b;
        System.out.println(String.format("%.2f", r));
      } else {
        System.out.println(String.format("%.2f", 0.0));
      }
    }
  }
}
