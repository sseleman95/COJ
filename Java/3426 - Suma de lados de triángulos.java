
import java.util.Scanner;

public class JavaApplication16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        
        long max = (a+b);
        long min = Math.abs(a-b)+1;
        
        long mins = (min*(min-1))/2;
        long maxs = ((max - 1) *(max))/2;
        System.out.println(maxs-mins);
    }
}