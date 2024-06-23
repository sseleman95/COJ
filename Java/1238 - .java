import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class NumeroACM {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        int n;
        while((n=Integer.parseInt(br.readLine()))!=0){
            String digitos=Integer.toString(n);
            int cont=digitos.length();
            int res = 0;
            int aux;
            for (int i = 0; i < digitos.length(); i++) {
                aux = Character.getNumericValue(digitos.charAt(i));
                res += aux * fac(cont);
                cont--;
            }
            System.out.println(res);
        }
    }

    static public int fac(int numero) {
        if (numero == 0) {
            return 1;
        } else {
            return numero * fac(numero - 1);
        }
    }
}
