
import java.util.Scanner;


public class CountingZeros {

    
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
       int a=l.nextInt();
       while(a--!=0){
       long b=l.nextLong();
       
       long c;
       int suma=0;
       if(b>=5){
       if(b%5==0){
           c=b;
       }else{
           c=b-(b%5);
           
       }
       while(c>=5){
           suma+=c/5;
           c/=5;
       }
           System.out.println(suma);
      }else{
            System.out.println(0);
}
       }
    }
}
    
    

