import java.util.*;

public class coj {

	public static void main(String[] args) {
		double t = 0, tt = 0;
		int n, j = 0;
		Scanner sc = new Scanner(System.in);
		n =sc.nextInt();
			
		for (int i = 1; i <= n; i++) {
			t = sc.nextDouble();
			if (tt <= t) {
				tt = t;
				j = i;
			}			
		}
		System.out.println(j);
	}
}