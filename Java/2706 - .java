import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class FractionalLotion {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String cad;
        int res,n;
        while((cad=br.readLine())!=null){
            res=0;
            n=Integer.parseInt((String) cad.subSequence(2,cad.length()));
            for (int i = n+1; i <= 2*n; i++) {
                if((n*i)%(i-n)==0){
                    res++;
                }
            }
            System.out.println(res);
        }
    }
}
