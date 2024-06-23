
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author LESH
 */
public class HeSOffside {

    
    public static void main(String[] args) {
       Scanner l=new Scanner(System.in);
       int ataque[];
        int defensa[];
        int a=l.nextInt();
         int b=l.nextInt();
        
        while(a!=0&&b!=0){
            ataque=new int[a];
             defensa=new int[b];
            
            for(int i=0;i<a;i++){
                ataque[i]=l.nextInt();
            }
            for(int i=0;i<b;i++){
               defensa[i]=l.nextInt();
            }
            Arrays.sort(ataque);
             Arrays.sort(defensa);
             if(ataque[0]<defensa[1]){
                 System.out.println("Y");
             }else{
                 System.out.println("N");
             }
            a=l.nextInt();
            b=l.nextInt();
            
        }
    }
    
}
