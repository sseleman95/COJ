import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        char [] letter = str.toCharArray();
        Arrays.sort(letter);
        String order = new String(letter);
        System.out.println(order);
      
    }
}
