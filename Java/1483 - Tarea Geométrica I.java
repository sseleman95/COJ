import java.util.*;

public class coj {

	public static void main(String[] args) {

		int A,B;
		
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next(); 
		
		switch (S) {
			case "square":
				A = sc.nextInt();
				System.out.println(A*A);
			break;
			case "rectangle":
				A = sc.nextInt(); B = sc.nextInt();
				System.out.println(A*B);
			break;
		}
		
	}

}