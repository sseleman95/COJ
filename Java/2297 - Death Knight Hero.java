
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
public class DeathKnightHero {

    
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        int n=l.nextInt();
        int a=n;
        for(int i=0;i<n;i++){
            String p=l.next();
            if(p.indexOf("CD")!=-1){
                a--;
            }
        }
        System.out.println(a);
    }
    
}
