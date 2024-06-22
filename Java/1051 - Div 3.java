import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        long n = sc.nextLong();
        if ((n%3)<2) {
            System.out.println(2*(n/3));
        } else {
            System.out.println((2*(n/3))+1);
        }
        
    }
    
}