import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int a = sc.nextInt();
        
        for(int i = 0;i < a; i++){
            long b = sc.nextLong();
            long c = 0;
        
            for(int j = 0; j < b; j++)
                c += sc.nextLong();
            
            if(c % b == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        
    }
    
}
