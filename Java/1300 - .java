import java.io.*;
import java.util.*;
public class Modulo {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in),1024*8);
        PrintWriter pw=new PrintWriter(System.out,false);
        int V[]=new int[10];
        int n;
        for (int i = 0; i < 10; i++) {
            n=Integer.parseInt(br.readLine());
            V[i]=n%42;
        }
        Arrays.sort(V);
        int x=0;
        int cont=1;
        for (int i = 0; i < 10; i++) {
            if(V[x]!=V[i]){
                cont++;
                x=i;
            }
        }
        pw.println(cont);
        pw.close();
    }
}
