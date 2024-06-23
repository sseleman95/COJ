import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class PasosNumericos {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if(x==y){
                if(x%2==0){
                    System.out.println(x*2);
                }
                else{
                    System.out.println(x*2-1);
                }
            }
            else if(x-2==y){
                if(x%2==0){
                    System.out.println(x+y);
                }
                else{
                    System.out.println(x+y-1);
                }
            }
            else{
                System.out.println("No Number");
            }
        }
    }
}
