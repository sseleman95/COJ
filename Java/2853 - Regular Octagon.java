import java.util.Scanner;

public class JavaApplication6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextInt();
               
        while (true) {   
            
            if (c==0) {
                break;
            }
           double b = c/(Math.sqrt(2)+2);
           double a = c-(2*b);
           double p = 8*a;
           double ap= c/2;
           double ar= p*ap/2;
            System.out.printf("%.3f"+"\n", ar);
            
            c = sc.nextInt();
        }
    }
}