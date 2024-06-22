import java.util.Scanner;

public class JavaApplication5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {            
            int[] n = new int[sc.nextInt()];
            int m = sc.nextInt();
            
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < n.length; k++) {
                    n[k]+=sc.nextInt();
                }
            }
            int pos = 0;
            int mayor = n[0];
            for (int j = 1; j < n.length; j++) {
                if (mayor < n[j]) {
                    pos = j; mayor = n[j];
                }
            }
            System.out.println(pos+1);
        }
    }
}