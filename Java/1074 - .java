import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backtracking {
    public static int cont;
    public static boolean aux=false;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in),1024*8);
        int N;
        int sol[];
        String line;
        while ((line=br.readLine())!=null) {
            N=Integer.parseInt(line);
            cont=0;
            sol = new int[N];
            aux=false;
            bt(0, N, sol);
            if (aux == false) {
                System.out.println("No Solution.");
            }
        }
    }
    
    public static void bt(int nivel, int n,  int sol[]) {
        if(nivel == n) {
            cont++;
            System.out.print(cont+" : ");
            for (int i = 0; i < nivel; i++) {
                if (i != nivel - 1) {
                    System.out.print(sol[i] + 1 + " ");
                } else {
                    System.out.print(sol[i] + 1);
                }
                aux = true;
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < n; i++) {
            boolean ban=true;
            for (int j = 0; j < nivel; j++) {
                if (ame(j, sol[j], nivel, i)) {
                    ban = false;
                    break;
                }
            }
            if (ban) {
                sol[nivel] = i;
                bt(nivel + 1, n, sol);
            }
        }
    }
    public static boolean ame(int i,int j,int i2, int j2)
    {
        if (j==j2 || i==i2 || Math.abs(i-i2)==Math.abs(j-j2)) {
            return true;
        }
        return false;
    }
}
