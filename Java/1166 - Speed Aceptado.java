import java.util.Scanner;

public class Speed {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int c = sc.nextInt();
        int n = 0, even = 0, odd = 0, x = 0;
        
        for(int i = 0; i < c; i++){
            n = sc.nextInt();
            
            for(int j = 0; j < n; j++){
                x = sc.nextInt();
                if(x % 2 == 0){
                    odd++;
                }else{
                    even++;
                }
            }
            
            System.out.println(odd + " even and " + even + " odd.");
            odd = even = 0;
        }
       
    }
}