import java.util.Scanner;

public class JavaApplication20 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int cc = 0;
        while (sc.hasNext()) { 
            int c = 0;
            int n = sc.nextInt();
            String s = Integer.toBinaryString(n);
          
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i)== '1') {
                    c++;
                }
            }
            
            if (c%2==0) {
                cc++;
            }
        }
        System.out.println(cc);
    }
}