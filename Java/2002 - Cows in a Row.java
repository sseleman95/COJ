import java.util.*;

public class COJ2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int cont = 0;
		int numdif = -1;
		int max = 0;
		for (int i = 0; i < n; i++) {
			numdif = -1;
			cont = 1;
			for (int j = i + 1; j < n; j++) {
				if (a[j] != a[i]) {
					if (numdif == -1) {
						numdif = a[j];
					} else {
						if (numdif != a[j]) {
							j = n;
							break;
						}
					}
				} else {
					cont++;
				}
			}
			if (cont > max) {
				max = cont;
			}
		}
		System.out.println(max);
	}
}