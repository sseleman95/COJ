
import java.io.*;

public class CountonCantor1105 {

    private static InputStreamReader isr = new InputStreamReader(System.in);
    private static BufferedReader br = new BufferedReader(isr);
    private static OutputStreamWriter osw = new OutputStreamWriter(System.out);
    private static BufferedWriter bw = new BufferedWriter(osw);

    public static void main(String args[]) throws IOException {
        int numCasos = Integer.parseInt(br.readLine());
        int num, diagonalAnt, resto;

        for (int i = 0; i < numCasos; i++) {
            num = Integer.parseInt(br.readLine());
            diagonalAnt = (int) (Math.sqrt(num << 1) - 0.5);
            resto = num - diagonalAnt * (diagonalAnt + 1) / 2;
            if ((diagonalAnt & 1) == 0) {
                bw.append("TERM " + num + " IS " + (diagonalAnt + 2 - resto) + "/" + resto);
            } else {
                bw.append("TERM " + num + " IS " + resto + "/" + (diagonalAnt + 2 - resto));
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
