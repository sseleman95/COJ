
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
public class MultiplesOfNine {

   
    public static void main(String[] args) {
      Scanner l=new Scanner(System.in);
      String s=l.next();
      String s2="";
      int cont=0;
      int suma=0;
      boolean v=true;
      
      while(!s.equals("0")){
          s2=s;
          while(s2.length()>=1){
              suma=0;
          for(int i=0;i<s2.length();i++){
              suma+=s2.charAt(i)-'0';
              
          }
          if(suma%9==0){
              
              cont++;
              s2=Integer.toString(suma);
          }else{
              
              s2="";
              System.out.println(s+" is not a multiple of 9.");
              v=false;
              break;
          }
          
           
            if(suma<=9){
                break;
            }
             
          }
          if(v){
           System.out.println(s+" is a multiple of 9 and has 9-degree "+cont+".");
           
              
          }
           s=l.next();
           s2="";
           v=true;
           cont=0;
           suma=0;
      }
    }
    
}
