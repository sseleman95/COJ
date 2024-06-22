import java.util.*;

public class AAA {
	public static void main(String[] args) {
            char cad =' ';
            String aa = "", bb = "";
            Scanner sc =new Scanner(System.in);
            String a=sc.nextLine(); String b=sc.nextLine();
            
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i)!=cad) {
                    aa +=a.charAt(i);
                }
            }
            for (int i = 0; i < b.length(); i++) {
                
                if (b.charAt(i)!=cad) {
                    bb +=b.charAt(i);
                }
            }
            
            if (a.equals(b)) {
                System.out.println("Accepted");
            } else if ((!a.equals(b))&&(aa.equals(bb))) {
                System.out.println("Presentation Error");
            } else {
                System.out.println("Wrong Answer");
            }
        }
}