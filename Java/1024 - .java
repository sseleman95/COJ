import java.io.*;
public class Hangover {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in),1024*8);
        PrintWriter pw=new PrintWriter(System.out,false);
        float c;
        c=Float.parseFloat(br.readLine());
        while(c!=0.00){
            float n=1;
            int cartas=0;
            for (float i =0; i <c;) {
                i+=1/(n+1);
                n++;
                cartas++;
            }
            pw.println(cartas+" card(s)");
            c=Float.parseFloat(br.readLine());
        }
        pw.close();
    }
}
