import java.util.Scanner;

public class JavaApplication9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int a = sc.nextInt();
            int par = 0, imp = 0;
            for (int j = 0; j < a; j++) {
                int num = sc.nextInt();
                if (num % 2 == 0) {
                    par++;
                } else {
                    imp++;
                }
            }
            System.out.println(par + " even and " + imp + " odd.");

        }

    }

}