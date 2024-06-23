
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
public class BinaryToRoman {
    public static String convert(int numero){
        String romano="";
        int[] decimalValue ={ 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] romanNumeral = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

  for (int index = 0; index < decimalValue.length; index++) {
    while (decimalValue[index] <= numero) {
      romano += romanNumeral[index];
      numero -= decimalValue[index];
    }
  }
        
        return romano;
    }
    
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        int a=l.nextInt();
        String s;
        int decimal;
        for(int i=0;i<a;i++){
            s=l.next();
            decimal=Integer.parseInt(s, 2);
            System.out.println(convert(decimal));
        }
    }
    
}
