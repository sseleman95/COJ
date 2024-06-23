import java.io.*;
import java.util.*;
public class WhatsNext {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in),1024*8);
        PrintWriter pw=new PrintWriter(System.out,false);
        while(true){
        StringTokenizer st=new StringTokenizer(br.readLine());
        int a1=Integer.parseInt(st.nextToken());
        int a2=Integer.parseInt(st.nextToken());
        int a3=Integer.parseInt(st.nextToken());
        if(a1==0 && a2==0 && a3==0){
            break;
        }
            if(a2-a1==a3-a2){
                pw.println("AP "+ ((a2-a1)+a3));
            }
            else{
                pw.println("GP "+(a2/a1)*a3);
            }
        }
        pw.close();
    }
}
