
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LESH
 */
public class PrimaryArithmetic {

    
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        String s=l.next();
        String s2=l.next();
        while(!s.equals("0")&&!s2.equals("0")){
            int cont=0;
            int acarreo=0;
            
           if(s.length()>=s2.length()){
               for(int i=s.length()-1;i>=0;i--){
                   System.out.println(s.charAt(i)-'0'-s2.charAt(i)-'0');
                   if(s.charAt(i)-'0'+s2.charAt(i)-'0'>9){
                       
                   }
               }
           }else{
               
           }
           s=l.next();
            s2=l.next();
        }
    }
    
}
