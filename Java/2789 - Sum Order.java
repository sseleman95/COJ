import java.util.*;

public class COJ2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		StringTokenizer tk = new StringTokenizer(sc.nextLine(), "+");
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (tk.hasMoreTokens()) {
			list.add(Integer.parseInt(tk.nextToken()));
		}

		Collections.sort(list);
		String result = "";
		for (int i = 0; i < list.size(); i++) {
			if (i == list.size() - 1) {
				result = result + list.get(i);
			} else {
				result = result + list.get(i) + "+";
			}
		}
		System.out.println(result);
	}
}