import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
        int n = 0, m = 0, a = 0;
    	n = in.nextInt();
    	m = in.nextInt();
    	a = in.nextInt();
    	long  row = (long) n / a;
        if(n % a != 0){
            row++;
        }
        long column = (long) m / a;
        if(m % a != 0){
            column++;
        }
        System.out.println(row * column);
  
    }
    
}
