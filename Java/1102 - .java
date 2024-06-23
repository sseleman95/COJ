import java.io.*;
import java.math.*;
public class YouCanSay11 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in),1024*8);
        PrintWriter pw=new PrintWriter(System.out,false);
        BigInteger a=new BigInteger("11");
        String cadena=br.readLine();
        while(!cadena.equals("0")){
            BigInteger b=new BigInteger(cadena);
            BigInteger modulo=b.mod(a);
            if(modulo.equals(BigInteger.ZERO)){
                pw.println(b+" is a multiple of 11.");
            }
            else{
                pw.println(b+" is not a multiple of 11.");
            }
            cadena=br.readLine();
        }
        pw.close();
    }
}
