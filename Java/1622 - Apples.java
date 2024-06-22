import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0, sum = 0, buscado = 0;
        int [] x = new int[102];
        
         while(in.hasNext()){
            n = in.nextInt();

            for(int i = 0; i < n; i++){
                x[i] = in.nextInt();
            }
            sum=0;
            for(int i = 0; i < n; i++){
                sum += x[i];
                buscado=0;
            }

            for(int i = 0; i < n; i++){
                if ((sum - x[i]) % 2 == 0) {
                    buscado++;
                }
            }
            System.out.println(buscado);
        }
    }
 }
