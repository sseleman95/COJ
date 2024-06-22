import java.util.Scanner;

public class JavaApplication16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            double x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();
            
            double x21=  Math.pow((x2-x1), 2);
            double y21=  Math.pow((y2-y1), 2);
            double d = Math.sqrt(x21) + Math.sqrt(y21);
            
            System.out.println((int)d);
        }
    }
} 