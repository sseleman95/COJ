import java.util.*;

public class COJ1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int cont=0;
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			switch (c) {
			case 'A':
				cont++;
				break;
			case 'B':
				cont+=2;
				break;
			case 'D':
				cont++;
				break;
			case 'O':
				cont++;
				break;
			case 'P':
				cont++;
				break;
			case 'Q':
				cont++;
				break;
			case 'R':
				cont++;
				break;
			
			default:
				break;
			}
		}
		System.out.println(cont);
	}
}
