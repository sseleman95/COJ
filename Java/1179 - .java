import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Optimal {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out,false);
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int vec[]=new int[a];
            for (int j = 0; j < a; j++) {
                vec[j]=Integer.parseInt(st.nextToken());
            }
            Arrays.sort(vec);
            int res=0;
            for (int j =a-1 ; j > 0; j--) {
                res+=vec[j]-vec[j-1];
            }
            pw.println(res*2);
        }
        pw.close();
    }
}
