import java.util.*;

public class coj {

	public static void main(String[] args) {

		   Scanner sc =new Scanner(System.in);
		   int r = 0;
		   String a = sc.next(); String b = sc.next();
		   char[] aa = a.toCharArray(); char[] bb = b.toCharArray();
		   
		   for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < b.length(); j++) {
				r += Integer.parseInt("" +aa[i])*Integer.parseInt("" +bb[j]);
			}
		}
			System.out.println(r);
	}

}