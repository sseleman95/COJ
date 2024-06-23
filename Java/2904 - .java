import java.io.*;
import java.math.*;

public class SuperSuma {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in),
      1024 * 8
    );
    PrintWriter pw = new PrintWriter(System.out, false);
    int T;
    BigInteger sum = new BigInteger("0");
    BigInteger n = new BigInteger("0");

    T = Integer.parseInt(br.readLine());
    for (int i = 0; i < T; i++) {
      n = new BigInteger(br.readLine());
      sum = sum.add(n);
    }
    pw.println(sum);
    pw.close();
  }
}
