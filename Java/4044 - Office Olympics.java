import java.util.*;

public class COJ1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();

		ArrayList<Integer> c = new ArrayList<Integer>();
		int sum = 0;
		
		for (int i = 0; i < b; i++) {
			int f = sc.nextInt();
			c.add(f);
			sum += f;
		}
		
		Collections.sort(c);
		int o = sum;
		int q = a;
		int g = 1;
		
		while (c.size() > 1 && o >= q) {
			int fin = c.remove(c.size() - 1);
			o -= fin;
			q += fin;
			g++;
		}
		System.out.println(g);
	}
}