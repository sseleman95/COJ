import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Gool {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String cadena="";
        for (int i = 0; i <n; i++) {
            cadena+='o';
        }
        System.out.println("G"+cadena+"l");
    }
}
