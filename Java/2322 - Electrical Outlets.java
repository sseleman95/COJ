import java.util.*;

public class COJ2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t, k, ok, p;
		t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			k = sc.nextInt();
			p = 1;
			for (int j = 0; j < k; j++) {
				ok = sc.nextInt();
				p += (ok - 1);
			}
			System.out.println(p);
		}
	}
}