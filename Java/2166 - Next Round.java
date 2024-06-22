
import java.util.Scanner;

public class NextRound {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      
        int t = in.nextInt();
        
        long s = 0;
        
        for(int m = 0; m < t; m++){
            s  = 0;
            int n = in.nextInt();
            int k = in.nextInt();
            int [] score = new int[100];

            for(int i = 0; i < n; i++){
                score[i] = in.nextInt();
            }

            for(int j = 0; j < n; j++){
                if(score[j] >= score[k - 1] && score[j] > 0){
                    s++;
                }
            }
            System.out.println(s);
        }
    }
}
