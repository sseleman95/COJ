import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Hulam {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out,false);
        int n=Integer.parseInt(br.readLine());
        int v=0;
        int res=0;
        for (int i = 0; i < n; i++) {
            v=Integer.parseInt(br.readLine());
            if(v==1){
                pw.println(1);
            }
            else if(v==2){
                pw.println(2);
            }
            else{
                res=3*(v-2)+1;
                pw.println(res);
            }
        }
        pw.close();
    }
}
