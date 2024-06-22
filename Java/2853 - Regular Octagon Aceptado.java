import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            int n = in.nextInt();
            double area = 2 * (Math.sqrt(2) - 1) * (Math.pow(n, 2)); 
            if(n == 0){
                break;
            }
            System.out.println(String.format("%.3f", area));
        }
    }
 }
