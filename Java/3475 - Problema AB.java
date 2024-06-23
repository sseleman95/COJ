import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class JavaApplication1 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    args = br.readLine().split(" ");
    BigInteger a = new BigInteger(args[0]), b = new BigInteger(args[1]);
    BigInteger mult = a.multiply(b);
    System.out.println(mult);
  }
}
