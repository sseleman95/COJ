import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        int [] list = new int[c];
        
        for(int i = 0; i < c; i++){
            list[i] = in.nextInt();
        }
        Arrays.sort(list);

        for(int i = 0; i < c; i++){
             System.out.println(list[i]);
        }
        
    }
}
