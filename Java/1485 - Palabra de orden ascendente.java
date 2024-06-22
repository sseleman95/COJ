import java.util.*;

public class coj {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
       ArrayList<Character> alfa=new ArrayList<Character>();
       
        for (int i = 0; i < c.length(); i++) {
        	alfa.add(c.charAt(i));
		}
        Collections.sort(alfa);
        
        for (int i = 0; i < alfa.size(); i++) {
			System.out.print(alfa.get(i));
		}
 
	}
}