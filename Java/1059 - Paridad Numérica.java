import java.util.Scanner;

public class JavaApplication16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(),cont=0;
        while (l!=0) {            
            String bi = Integer.toBinaryString(l);
            
            for (int i = 0; i < bi.length(); i++) {
                
                if (bi.charAt(i)=='1') {
                    cont++;
                }
            }
            System.out.println("The parity of "+bi+" is "+cont+" (mod 2).");
            cont=0;
            l = sc.nextInt();
        }
    }
}