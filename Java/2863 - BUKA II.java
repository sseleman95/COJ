
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.Scanner;

public class BUKKAII {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        String s1;
        String s2;
        double c,d;
       // BigDecimal c = new BigDecimal("0");
        //BigDecimal d = new BigDecimal("0");
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("0");

        s1 = l.next();
        String S = l.next();
        s2 = l.next();
        switch (S) {
            case "+":
                a = new BigInteger(s1);
                b = new BigInteger(s2);
                System.out.print(a.add(b));
                break;

            case "-":
                a = new BigInteger(s1);
                b = new BigInteger(s2);
                System.out.print(a.subtract(b));

                break;
            case "*":
                a = new BigInteger(s1);
                b = new BigInteger(s2);
                System.out.print(a.multiply(b));
                break;
            case "/":
               // c = new BigDecimal(s1);
                //d = new BigDecimal(s2);
                c=Double.parseDouble(s1);
                d=Double.parseDouble(s2);
                //System.out.println(c.divide(d));
                System.out.println(c/d);
                break;
            case "%":
                a = new BigInteger(s1);
                b = new BigInteger(s2);
                System.out.print(a.mod(b));
                break;
        }

    }
}
