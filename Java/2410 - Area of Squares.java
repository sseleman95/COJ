import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c, a, n;
        double r;

        c = sc.nextInt();

        for (int i = 1; i <= c; i++) {
            a = sc.nextInt();
            n = sc.nextInt();

            r = Math.pow(a, 2) * Math.pow(1.0 / 2.0, n - 1);

            System.out.printf("Case #%d: %.2f\n", i, r);
        }
    }
}
