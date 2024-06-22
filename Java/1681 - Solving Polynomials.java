import java.util.*;

public class Main
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if( ((Math.pow(b, 2)) - 4 * a * c) < 0){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}