
import java.util.Scanner;

/**
 *
 * @author LESH
 */
public class BalancedWordsII {

    
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        int n=l.nextInt();
        String palabra;
        int cont1=0,cont2=0;
        while(n--!=0){
            palabra=l.next();
            for(int i=0;i<palabra.length();i++){
                if(palabra.charAt(i)-'0'<=42){
                    cont1++;
                }
                if(palabra.charAt(i)-'0'>=49){
                    cont2++;
                }
            }
            
            if(cont1==cont2){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
            cont1=0;
            cont2=0;
        }
    }
    
}
