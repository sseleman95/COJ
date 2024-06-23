
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
public class Numbersrebmun {

   
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        int a=l.nextInt();
        String s;
        String s2="";
        String s3="";
        int n,m;
        while(a-->0){
            s=l.next();
           s=s.toUpperCase();
           for(int i=0;i<s.length();i++){
               if(s.charAt(i)=='A'||s.charAt(i)=='B'||s.charAt(i)=='C'){
                   s2+='2';
               }
               if(s.charAt(i)=='D'||s.charAt(i)=='E'||s.charAt(i)=='F'){
                   s2+='3';
               }
               if(s.charAt(i)=='G'||s.charAt(i)=='H'||s.charAt(i)=='I'){
                   s2+='4';
               }
               if(s.charAt(i)=='J'||s.charAt(i)=='K'||s.charAt(i)=='L'){
                   s2+='5';
               }
               if(s.charAt(i)=='M'||s.charAt(i)=='N'||s.charAt(i)=='O'){
                   s2+='6';
               }
               if(s.charAt(i)=='P'||s.charAt(i)=='Q'||s.charAt(i)=='R'||s.charAt(i)=='S'){
                   s2+='7';
               }
               if(s.charAt(i)=='T'||s.charAt(i)=='U'||s.charAt(i)=='V'){
                   s2+='8';
               }
               if(s.charAt(i)=='W'||s.charAt(i)=='X'||s.charAt(i)=='Y'||s.charAt(i)=='Z'){
                   s2+='9';
               }
           }
           for(n=0,m=s2.length()-1; n < m; n++,m--){  
            if(s2.charAt(n)!=s2.charAt(m)) break;  
        }  
            if(n < m) System.out.println("NO");  
        else System.out.println("YES");
        }
    }
    
}
