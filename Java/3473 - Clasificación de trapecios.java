import java.util.*;

public class COJ2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ang = new int[4];

		int right = 0;

		for (int i = 0; i < 4; i++) {
			int n = sc.nextInt();
			if (n == 90) {
				right++;
			}

			ang[i] = n;
		}

		if (ang[0] + ang[1] + ang[2] + ang[3] == 360) {

			if (right == 2) {
				System.out.println("right");
			} else if ((ang[0] == ang[1] && ang[2] == ang[3] && ang[0] != 90)
					|| (ang[0] == ang[2] && ang[1] == ang[3] && ang[0] != 90)
					|| (ang[0] == ang[3] && ang[1] == ang[2]) && ang[0] != 90) {
				System.out.println("isosceles");
			} else {
				System.out.println("none of the previous");
			}

		} else {
			System.out.println("none of the previous");

		}
	}
}