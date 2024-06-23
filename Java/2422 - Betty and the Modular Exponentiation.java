import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BettyandtheModularExponentiation {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int n;
        String readed;
        String[] readedArray;
        BigInteger exponent;
        String s = "1000000000";
        BigInteger result;
        BigInteger last = new BigInteger(s);

        n = Integer.parseInt(in.readLine());
        for (int i = 0; i < n; i++) {
            readed = in.readLine();
            readedArray = readed.split(" ");
            s = readedArray[0];
            result = new BigInteger(s); 
            s = readedArray[1];
            exponent = new BigInteger(s); 
            result = result.modPow(exponent, last);
            System.out.println(result);
        }
    }
}
