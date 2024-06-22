public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine(), salida = "";
		
		while (s.length() > 2) {
			String tmp = s.substring(s.length() - 3);
			salida = Long.toString(Long.parseLong(tmp, 2), 8) + salida;
			s = s.substring(0, s.length() - 3);
		}
		
		if (s.length() > 0) {
			salida = Long.toString(Long.parseLong(s, 2), 8) + salida;
		}
		
		System.out.println(salida);
	}
}