import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class LATIN {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String palabra=br.readLine();
            char inicio=palabra.charAt(0);
            if(inicio=='a' || inicio=='e' || inicio=='i' || inicio=='o' || inicio=='u'){
                System.out.println(palabra+"cow");
            }
            else{
                String nueva=palabra.substring(1,palabra.length());
                System.out.println(nueva+inicio+"ow");
            }
        }
    }
}
