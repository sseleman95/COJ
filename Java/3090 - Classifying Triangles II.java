import java.util.*;

public class coj {

	public static void main(String[] args) {
		int a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt(); b = sc.nextInt(); c = sc.nextInt();
        
        if ((Math.pow(a, 2)==Math.pow(b, 2)+Math.pow(c, 2))||(Math.pow(b, 2)==Math.pow(a, 2)+Math.pow(c, 2))||(Math.pow(c, 2)==Math.pow(a, 2)+Math.pow(b, 2))) {
			System.out.println("rectangulo");
		} else if ((Math.pow(a, 2)>Math.pow(b, 2)+Math.pow(c, 2))||(Math.pow(b, 2)>Math.pow(a, 2)+Math.pow(c, 2))||(Math.pow(c, 2)>Math.pow(a, 2)+Math.pow(b, 2))) {
			System.out.println("obtusangulo");
		} else {
			System.out.println("acutangulo");
		}
	}

}