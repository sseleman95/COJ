import java.util.*;

public class COJ1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte T;
		byte caso;
		String cadena, salida;
		char letra;
		int i, j;
		String aux;

		T = sc.nextByte();
		
		for (caso = 1; caso <= T; caso++) {
		   System.out.print("Case " + caso + ": ");
		   cadena = sc.next();
		   salida = "";
		   letra = cadena.charAt(0);
		   aux = "";
		   
		   for (i = 1; i < cadena.length(); i++) {
		    if (cadena.charAt(i) >= '0' && cadena.charAt(i) <= '9')
		     aux += cadena.charAt(i);
		    else {
		    	
		     for (j = 0; j < Integer.parseInt(aux); j++)
		      salida += letra;
		     letra = cadena.charAt(i);
		     aux = "";
		    }
		   }
		   
		   for (j = 0; j < Integer.parseInt(aux); j++)
		    salida += letra;
		   System.out.println(salida);
		}
	}
}