import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Missing {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean vec[] = new boolean[n+1];
        vec[0]=true;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i < n; i++) {
            vec[Integer.parseInt(st.nextToken())]=true;
        }
        for (int i = 0; i < vec.length; i++) {
            if(vec[i]==false){
                System.out.println(i);
            }
        }
    }
}
