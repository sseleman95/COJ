import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class Changelle {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out, false);
        int n=Integer.parseInt(br.readLine());
        int one=0;
        int two=0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st=new StringTokenizer(br.readLine());
            String a=st.nextToken();
            String b=st.nextToken();
            if(a.equals("rock")){
                if(b.equals("scissors")){
                    one++;
                }
                else if(b.equals("paper")){
                    two++;
                }
                else{
                    one++;
                    two++;
                }
            }
            else if(a.equals("scissors")){
                if(b.equals("rock")){
                    two++;
                }
                else if(b.equals("paper")){
                    one++;
                }
                else{
                    one++;
                    two++;
                }
            }
            else{
                if(b.equals("paper")){
                    one++;
                    two++;
                }
                else if(b.equals("rock")){
                    one++;
                }
                else{
                    two++;
                }
            }
        }
        if(one>two){
           pw.println("A win");
        }
        else if(two>one){
            pw.println("B win");
        }
        else if(two==one){
            pw.println("tied");
        }
        pw.close();
    }
}
