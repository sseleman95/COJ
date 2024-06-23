import java.util.Scanner;

public class The3n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, cont;
        while (sc.hasNext()) {
            a = sc.nextInt();
            b = sc.nextInt();
            cont = 0;
            cont = Serie(a, b);
            System.out.println(a + " " + b + " " + cont);
        }
    }

    public static int Serie(int a, int b) {
        int cont = 0, contm = -1;
        int maxi = Math.max(a, b);
        int mini = Math.min(a, b);
        int n = 0;
        for (int i = mini; i <= maxi; i++) {
            n = i;
            cont = 0;
            while (n != 1) {
                if (n % 2 == 0) {
                    n = n / 2;
                    cont++;
                } else {
                    n = 3 * n + 1;
                    cont++;
                }
            }
            if (cont > contm) {
                contm = cont;
            }
        }
        return contm + 1;
    }
}
