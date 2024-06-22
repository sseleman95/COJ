import java.util.*;

public class COJ2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean continuar = true;

		while (continuar) {
			String s = sc.nextLine();

			if (s.equalsIgnoreCase("X")) {
				continuar = false;
			} else {

				int suma = 0;
				String st = sc.nextLine();

				for (int i = 0; i < s.length(); i++) {

					if (s.charAt(i) != st.charAt(i)) {
						suma++;
					}

				}

				System.out.print("Hamming distance is " + suma + ".\n");
			}
		}
	}
}