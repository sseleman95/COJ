import java.util.*;

public class COJ2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Character> c = new ArrayList<>();
		
		int n = sc.nextInt();		
		String s = sc.next();
		
		for (int i = 0; i < n; i++) {
			c.add(s.charAt(i));
        } 

		Collections.sort(c);
		
		int r = n/2;
		System.out.println(c.get(r));
		
	}
}