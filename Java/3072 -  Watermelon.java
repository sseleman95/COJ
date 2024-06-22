import java.util.Scanner;

public class Watermelon {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        
        double weight = in.nextInt();
        double k = weight / 2;
    
        if(weight % 2 == 0 && weight != 2){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
    }
    
}
