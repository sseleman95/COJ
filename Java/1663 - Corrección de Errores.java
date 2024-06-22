import java.util.*;

public class COJ1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  byte N;
		  boolean[][] mat;
		  byte i, j;
		  byte sum;
		  byte fil, col;

		  // AQUI INICIA EL PROGRAMA
		  N = sc.nextByte();
		  while (N > 0) {
		   mat = new boolean[N][N];
		   fil = col = -1;
		   for (i = 0; i < N; i++)
		    for (j = 0; j < N; j++)
		     mat[i][j] = (sc.nextByte() == 1) ? true : false;
		   if (cumpleParidad(mat)) 
		    System.out.println("OK");
		   else {
		    // buscamos errores en filas
		    for (i = 0; i < N; i++) {
		     sum = 0;
		     for (j = 0; j < N; j++)
		      if (mat[i][j])
		       sum++;
		     if ((sum & 1) == 1) {
		      fil = i;
		      break;
		     }
		    }
		    if (fil > 0) {
		     // buscamos errores en columnas
		     for (j = 0; j < N; j++) {
		      sum = 0;
		      for (i = 0; i < N; i++)
		       if (mat[i][j])
		        sum++;
		      if ((sum & 1) == 1) {
		       col = j;
		       break;
		      }
		     }
		    }
		    // reparamos
		    if (fil >= 0 && col >= 0)
		     mat[fil][col] = !mat[fil][col];
		    if (cumpleParidad(mat))
		     System.out.println("Change bit (" + (fil + 1) + ","
		       + (col + 1) + ")");
		    else
		     System.out.println("Corrupt");
		   }
		   N = sc.nextByte();
		  }
		 }

		 /** Para comprobar si la matriz cumple con la paridad */
		 private static boolean cumpleParidad(boolean[][] mat) {
		  byte i, j;
		  byte sum;
		  // buscamos filas
		  for (i = 0; i < mat.length; i++) {
		   sum = 0;
		   for (j = 0; j < mat.length; j++)
		    if (mat[i][j])
		     sum++;
		   if ((sum & 1) == 1)
		    return false;
		  }
		  // buscamos columnas
		  for (j = 0; j < mat.length; j++) {
		   sum = 0;
		   for (i = 0; i < mat.length; i++)
		    if (mat[i][j])
		     sum++;
		   if ((sum & 1) == 1)
		    return false;
		  }
		  return true;
		 }
		}
