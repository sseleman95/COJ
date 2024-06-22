import java.util.*;

public class COJ2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int c = sc.nextInt();
		float sum = 0;

		for (int i = 0; i < c; i++) {
			int n = sc.nextInt();
			sum += n;
		}
		double total = sum / c;
		System.out.printf("%.2f", total);
	}

}
