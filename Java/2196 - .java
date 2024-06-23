import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Paroimpar {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        BigInteger dos = new BigInteger("2");
        BigInteger cero =BigInteger.ZERO;
        for (int i = 0; i < n; i++) {           
            BigInteger valor = new BigInteger(br.readLine());
            if(valor.mod(dos)==cero){
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }
        }
    }
}
