import java.util.*;

public class COJ2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			String s = sc.next();

			if (s.equals("P=NP")) {
				System.out.println("skipped");
			} else {
				String p[] = s.split(("\\+"));
				
				int a = Integer.parseInt(p[0]);
				int b = Integer.parseInt(p[1]);

				System.out.println(a + b);

			}

		}
	}
}