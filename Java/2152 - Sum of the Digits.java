import java.util.*;

public class COJ2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cases = sc.nextInt();
		String num, linea;
		int sum;

		for (int i = 0; i < cases; i++) {
			linea = sc.next();
			if (linea.charAt(0) == '-')
				num = linea.substring(1);
			else
				num = linea;
			sum = 0;
			for (int j = 0; j < num.length(); j++)
				sum += (num.charAt(j) - '0');
			System.out.println(sum);
		}
	}
}