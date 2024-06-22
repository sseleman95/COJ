import java.util.*;

public class COJ2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.nextLine();
		String b = sc.nextLine();

		int[][] table = new int[a.length() + 1][b.length() + 1];
		for (int i = 0; i < a.length(); i++) {
			table[i][0] = i;
		}

		for (int j = 0; j < b.length(); j++) {
			table[0][j] = j;
		}

		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < b.length(); j++) {
				if (a.charAt(i) == b.charAt(j)) {
					table[i + 1][j + 1] = table[i][j];
				} else {

					table[i + 1][j + 1] = Math.min(Math.min(table[i + 1][j] + 1, table[i][j + 1] + 1), table[i][j] + 1);
				}
			}
		}

		System.out.println(table[a.length()][b.length()]);
	}
}