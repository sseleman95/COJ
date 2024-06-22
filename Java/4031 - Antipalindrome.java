import java.util.*;

public class COJ1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			String s = sc.next();

			ArrayList<Character> car = new ArrayList<>();
			int con = 0;
			car.clear();
			
			if (s.length() % 2 == 0) {

				for (int j = s.length()-1; j >= 0; j--) {
					car.add(s.charAt(j));
				}
				
				for (int j = 0; j < s.length(); j++) {
					if (car.get(j) == s.charAt(j)) {
						con++;
					}
				}
				
				if (con != 0) {

					System.out.println("no");
				} else {

					System.out.println("yes");
				}
			} else {
				System.out.println("no");
			}
		}
	}
}
