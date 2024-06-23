import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Counting {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));     
        PrintWriter pw=new PrintWriter(System.out,false);
        int casos = Integer.parseInt(br.readLine());
        for (int i = 0; i < casos; i++) {
            ArrayList<Character> lista = new ArrayList<Character>();
            int dif = 0;
            String cadena = br.readLine();
            for (int j = 0; j < cadena.length(); j++) {
                if (lista.contains(cadena.charAt(j))) {

                } else {
                    lista.add(cadena.charAt(j));
                    dif++;
                }
            }
            pw.println(dif);
        }
        pw.close();
    }
}
