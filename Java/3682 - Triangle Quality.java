import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
        	int k = in.nextInt();
			double a = 0, b = 0, c = 0, tq = 0;
			for(int i = 0; i < k; i++){
				
				a = in.nextDouble();
				b = in.nextDouble();
				c = in.nextDouble();
				tq = ((b + c - a) * (a + b - c) * (c + a - b)) / (a * b * c);

				if(tq == 1){
					System.out.println ("equilateral");
				}
				if(tq < 1 && tq > 0.5){
					System.out.println  ("good");
				}
				if(tq < 0 || tq <= 0.5){
					System.out.println  ("bad");
				}
         
     
        }
    }
}