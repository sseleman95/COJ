import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0, a = 0, b = 0, c = 0;
        n = in.nextInt();
        
       for(int i = 0; i < n; i++){
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            if((b*b)-(4*a*c) < 0){
                System.out.println("NO");
            }else{
                System.out.println("SI");
            }
        }
    }
}
