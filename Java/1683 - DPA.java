import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class DPA {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in),
      1024 * 8
    );
    PrintWriter pw = new PrintWriter(System.out, false);
    int T = Integer.parseInt(br.readLine());
    for (int i = 0; i < T; i++) {
      int a = Integer.parseInt(br.readLine());
      int suma = 0;
      for (int j = 1; j < a; j++) {
        if (a % j == 0) {
          suma += j;
        }
      }
      if (suma < a) {
        pw.println("Deficient");
      } else if (suma > a) {
        pw.println("Abundant");
      } else {
        pw.println("Perfect");
      }
    }
    pw.close();
  }
}
