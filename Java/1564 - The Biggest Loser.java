
import java.text.DecimalFormat;
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
public class TheBiggestLoser {

    
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("0.00");
        int a=l.nextInt();
        String nombre;
        String sexo;
        double pesoInicial;
        double pesoFinal;
        double porcentaje;
        while(a!=0){
            double porcentajemayorM=0;
        double porcentajemayorF=0;
        String nombremayorM="";
        String nombremayorF="";
            for(int i=0;i<a;i++){
                nombre=l.next();
                sexo=l.next();
                pesoInicial=l.nextDouble();
                pesoFinal=l.nextDouble();
                porcentaje=(pesoFinal*100.00)/pesoInicial;
                porcentaje=100.00-porcentaje;
                if(sexo.equals("M")){
                    if(porcentaje>porcentajemayorM){
                        porcentajemayorM=porcentaje;
                        nombremayorM=nombre;
                    }
                }else{
                    if(porcentaje>porcentajemayorF){
                        porcentajemayorF=porcentaje;
                        nombremayorF=nombre;
                    }
                }
            }
            System.out.println(nombremayorM+" "+df.format(porcentajemayorM)+"% "+nombremayorF+" "+df.format(porcentajemayorF)+"%");
            a=l.nextInt();
        }
    }
    
}
