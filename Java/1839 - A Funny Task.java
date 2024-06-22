import java.util.*;

public class Main
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int c = sc.nextInt();
        int orange = 0, temp;
        
        for(int i = 0; i < c; i++){
            orange = sc.nextInt();
            temp = orange;
            
            for(int j = 0; j < 3; j++){
                temp += 3;    
                temp *= 2;
            }
            System.out.println(temp);
        }
    }
}