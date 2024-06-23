import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TalkingP {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String cadena=br.readLine();
            cadena=cadena.replaceAll("a","apa");
            cadena=cadena.replaceAll("e","epe");
            cadena=cadena.replaceAll("i","ipi");
            cadena=cadena.replaceAll("o","opo");
            cadena=cadena.replaceAll("u","upu");
            System.out.println(cadena);
        }
    }
}
