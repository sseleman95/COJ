import java.util.*;

public class coj {

	public static void main(String[] args) {
		double pi = 3.14, r, a, b;
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		switch (s) {
		case "circle":
			r = sc.nextDouble();
			System.out.printf("%.2f", pi*Math.pow(r, 2));
		break;
		case "triangle":
			a = sc.nextDouble();
			b = sc.nextDouble();
			System.out.printf("%.2f", (a*b)/2);
		break;
		case "rhombus":
			a = sc.nextDouble();
			b = sc.nextDouble();
			System.out.printf("%.2f", (a*b)/2);
			
		break;
		}
		
	}

}