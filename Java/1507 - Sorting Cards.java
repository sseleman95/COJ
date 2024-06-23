
import java.util.Arrays;
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
public class SortingCards {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        char carta[] = {'A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K'};
        char juego[] = {'S', 'H', 'C', 'D'};
        String posiciones[];
        String cartas[];
        
        int a = l.nextInt();
        while (a-- > 0) {
            int c = l.nextInt();
            cartas = new String[c];
            posiciones = new String[c];
            for (int i = 0; i < c; i++) {
                cartas[i] = l.next();
            }
            for (int j = 0; j < c; j++) {
                for (int k = 0; k < carta.length; k++) {
                    if (carta[k] == cartas[j].charAt(0)) {
                        posiciones[j] = Integer.toString(k);
                    }
                }
                for (int p = 0; p < juego.length; p++) {
                    if (juego[p] == cartas[j].charAt(1)) {
                        posiciones[j] += Integer.toString(p);
                    }

                }
            }
            String aux;
            String aux2;
            for (int i = 0; i < posiciones.length - 1; i++) {
                for (int j = (i+1); j < posiciones.length; j++) {
                    if (Integer.parseInt("" + posiciones[i].charAt(0)) > Integer.parseInt("" + posiciones[j].charAt(0))) {
                        aux = cartas[i];
                        cartas[i] = cartas[j];
                        cartas[j] = aux;

                        aux2 = posiciones[i];
                        posiciones[i] = posiciones[j];
                        posiciones[j] = aux2;
                    }
                    if (Integer.parseInt("" + posiciones[i].charAt(0)) == Integer.parseInt("" + posiciones[j].charAt(0))) {
                        if (Integer.parseInt("" + posiciones[i].charAt(1)) > Integer.parseInt("" + posiciones[j].charAt(1))) {
                            aux = cartas[i];
                            cartas[i] = cartas[j];
                            cartas[j] = aux;

                            aux2 = posiciones[i];
                            posiciones[i] = posiciones[j];
                            posiciones[j] = aux2;
                        }
                    }
                }
                
            }
            for(int i=0;i<cartas.length;i++){
                    
                    if(i==cartas.length-1){
                        System.out.print(cartas[i]);
                    }else{
                        System.out.print(cartas[i]+" ");
                    }
                }
            //if(a>1){
                System.out.println("");
            //}
            
        }
    }

}
