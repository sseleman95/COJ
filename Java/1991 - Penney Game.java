
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
public class PenneyGame {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int r, a = l.nextInt();
        String coins, creada;
      
        int cont = 0, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0, cont7 = 0, cont8 = 0;
        int indice1 = 0, indice2 = 0;
        while (a-- != 0) {
            r = l.nextInt();
            coins = l.next();
            for (int i = 0; i < coins.length(); i++) {
                indice1 = i + 1;
                indice2 = i + 2;
                if (indice1 > coins.length() || indice2 >= coins.length()) {
                    break;
                }
                creada = "" + coins.charAt(i) + coins.charAt(indice1) + coins.charAt(indice2);
                if (creada.equals("TTT")) {
                    cont1++;
                }
                if (creada.equals("TTH")) {
                    cont2++;
                }
                if (creada.equals("THT")) {
                    cont3++;
                }
                if (creada.equals("THH")) {
                    cont4++;
                }
                if (creada.equals("HTT")) {
                    cont5++;
                }
                if (creada.equals("HTH")) {
                    cont6++;
                }
                if (creada.equals("HHT")) {
                    cont7++;
                }
                if (creada.equals("HHH")) {
                    cont8++;
                }
            }
            System.out.println(r+" "+cont1+" "+cont2+" "+cont3+" "+cont4+" "+cont5+" "+cont6+" "+cont7+" "+cont8);
            cont1=0;
            cont2=0;
            cont3=0;
            cont4=0;
            cont5=0;
            cont6=0;
            cont7=0;
            cont8=0;
            
            
        }
    }

}
