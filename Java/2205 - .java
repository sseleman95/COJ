import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class Contando {
    public static void main(String[] args) throws IOException {
        int n;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out, false);
        n=Integer.parseInt(br.readLine());
        int []vec=new int[1000];
        vec[0]=1;
        for (int i = 1; i < 1000; i++) {
            String cadena=Integer.toBinaryString(i+1);
            cadena=cadena.replace("0", "");
            int tam=cadena.length();
            vec[i]=tam;
        }
        for (int i = 0; i < n; i++) {
            StringTokenizer st=new StringTokenizer(br.readLine());
            int A=Integer.parseInt(st.nextToken());
            int B=Integer.parseInt(st.nextToken());
            int suma=0;
            for (int j = A; j <=B; j++) {
                suma+=vec[j-1];
            }
            pw.println(suma);
        }
        pw.close();
    }
}
