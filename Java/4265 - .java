import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int a = in.nextInt();
            int b = in.nextInt();

            double resA = a * Math.log10(2);
            double resB = b * Math.log10(5);

            System.out.println((int) (resA + resB + 1));
        }
    }
}
