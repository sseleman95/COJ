import java.io.*;
import java.lang.*;
import java.util.*;

public class FavoritosdeFederacion {

  public static void main(String[] args) throws java.lang.Exception {
    PrintWriter pw = new PrintWriter(System.out, false);
    BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in),
      1024 * 8
    );
    int acum, N;
    String res;
    while ((N = Integer.parseInt(br.readLine())) != -1) {
      acum = 0;
      res = " = ";
      for (int i = 1; i < N; i++) {
        if (N % i == 0) {
          acum += i;
          res += i + " + ";
        }
      }
      if (N == acum) {
        pw.println(N + res.substring(0, res.length() - 2));
      } else {
        pw.println(N + " is NOT perfect.");
      }
    }
    pw.close();
  }
}
