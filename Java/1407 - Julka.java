import java.math.BigInteger;
import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    Scanner l = new Scanner(System.in);
    for (int i = 0; i < 10; i++) {
      BigInteger claudia = new BigInteger("0");
      BigInteger natalia = new BigInteger("0");
      BigInteger divide = new BigInteger("2");
      BigInteger diferencia = new BigInteger("0");
      BigInteger total = new BigInteger("0");

      total = l.nextBigInteger();
      diferencia = l.nextBigInteger();

      natalia = total.subtract(diferencia);
      natalia = natalia.divide(divide);
      claudia = natalia;
      claudia = claudia.add(diferencia);

      System.out.println(claudia);
      System.out.println(natalia);
    }
  }
}
