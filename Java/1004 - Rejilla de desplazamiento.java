import java.util.*;

public class COJ2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t, a, b;
		t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			a = sc.nextInt(); b = sc.nextInt();

			if (a == b && a > 1) {
				if (a % 2 == 0) {
					System.out.print("L\n");
				} else {
					System.out.print("R\n");
				}
			} else if (b == 1) {
				if (a == 1) {
					System.out.print("R\n");
				} else {
					System.out.print("D\n");
				}
			} else if (a > b && b > 1) {
				if (b % 2 == 0) {
					System.out.print("U\n");
				} else {
					System.out.print("D\n");
				}
			} else if (b > a) {
				if (a % 2 == 0) {
					System.out.print("L\n");
				} else {
					System.out.print("R\n");
				}
			}
		}
	}
}