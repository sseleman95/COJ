import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double sum = 0;

        for(int i = 0; i < n; i++){
            
            for (int j = 0; j < 12; j++) {
                sum += sc.nextDouble();
            }

            DecimalFormat formatter = new DecimalFormat("##,###.00");
            System.out.println(i+1 + " $" + formatter.format( sum /12 ));
            sum = 0;
        }
    }
    
}
