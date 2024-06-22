import java.util.*;

public class COJ2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        
        if (b<2) {
			System.out.println("WRONG ANSWER");
		} else if (b>3) {
			System.out.println("RUNTIME ERROR");
		} else {
			System.out.println("ACCEPTED");
		}
    }
}