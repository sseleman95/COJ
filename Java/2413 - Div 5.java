import java.util.Scanner;
public class JavaApplication4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
            for (int i = 1; i <= t; i++) {

            String n = sc.next();

            char div = n.charAt(n.length()-1);

            if (div=='0' || div=='5') {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            } 
        }
    }    
}