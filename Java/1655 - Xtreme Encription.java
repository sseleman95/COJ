import java.util.*;

public class COJ1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String texto, texto2;
		int i, j;
		
		 while (sc.hasNext()) {
		   texto = sc.next();
		   texto2 = sc.next();
		   i = j = 0;
		   while (i < texto.length() && j < texto2.length()) {
		    if (texto.charAt(i) == texto2.charAt(j))
		     i++;
		    j++;
		   }
		   if (i == texto.length())
		    System.out.println("Yes");
		   else
		    System.out.println("No");
		 }
	}
}
