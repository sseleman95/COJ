import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c   = in.nextInt();
        int sum = 0;
        int cont = 0;
        
        int [] k = new int[10];
        
        for(int i = 0; i < c; i++){
            for(int j = 0; j < 10; j++){
                 k[j] = in.nextInt();
            }
            Arrays.sort(k);
            for(int t = 1; t < 9; t++){
                sum += k[t];
            }
            cont++;
            System.out.println(cont + " " + sum);
            sum = 0;
        }
    }
}