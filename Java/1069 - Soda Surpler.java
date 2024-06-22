import java.util.*;

public class COJ2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		for (int i = 0; i < a; i++) {
			int e = sc.nextInt(), f = sc.nextInt(), c = sc.nextInt(), total, cont = 0, cont2 = 0, multi = 0;

			if (c == 1) {
				System.out.println(0);
			} else {
				total = e + f;

				while (total != 0) {
					for (int j = c; j <= total; j += c) {
						cont += 1;
					}
					cont2 += cont;
					multi = cont * c;
					total -= multi;
					total += cont;
					cont = 0;
					multi = 0;

					if (total < c) {
						break;
					}
				}
				System.out.println(cont2);
			}
		}
	}
}