import java.io.*;

public class TheSevenPercentSolution {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in),
      1024 * 8
    );
    PrintWriter pw = new PrintWriter(System.out, false);
    String cadena = br.readLine();
    while (cadena.charAt(0) != '#') {
      cadena = cadena.replace("%", "%25");
      cadena = cadena.replace(" ", "%20");
      cadena = cadena.replace("!", "%21");
      cadena = cadena.replace("$", "%24");
      cadena = cadena.replace("(", "%28");
      cadena = cadena.replace(")", "%29");
      cadena = cadena.replace("*", "%2a");
      pw.println(cadena);
      cadena = br.readLine();
    }
    pw.close();
  }
}
