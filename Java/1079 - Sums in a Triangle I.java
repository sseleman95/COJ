import java.util.*;

public class COJ1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int nt, n; 
        int[][] matriz; 
        nt = sc.nextInt();

        while (nt-- > 0) {
            n = sc.nextInt();
            matriz = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    matriz[i][j] = sc.nextInt();
                }
            }
            System.out.println(obtenerSumaMasLarga(matriz, n));
        }
        sc.close();
    }


    private static int obtenerSumaMasLarga(int[][] matriz, int n) {
        int i, j; 
        for (i = n - 2; i >= 0; i--) {
            for (j = 0; j <= i; j++) {
                matriz[i][j] = Math.max(matriz[i][j] + matriz[i + 1][j],
                        matriz[i][j] + matriz[i + 1][j + 1]);
            }
        }
        return matriz[0][0];
    }
		
}