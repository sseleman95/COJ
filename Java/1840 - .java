import java.io.*;

public class CadenasQuebradas {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in),
      1024 * 8
    );
    PrintWriter pw = new PrintWriter(System.out, false);
    int T;
    T = Integer.parseInt(br.readLine());
    for (int m = 0; m < T; m++) {
      String cadena;
      cadena = br.readLine();
      int V[] = new int[6];
      for (int i = 0; i < cadena.length(); i++) {
        switch (cadena.charAt(i)) {
          case 'B':
            V[0]++;
            break;
          case 'R':
            V[1]++;
            break;
          case 'O':
            V[2]++;
            break;
          case 'K':
            V[3]++;
            break;
          case 'E':
            V[4]++;
            break;
          case 'N':
            V[5]++;
            break;
          default:
            break;
        }
      }
      boolean band = false;
      if (V[0] == V[1]) {
        if (V[1] == V[2]) {
          if (V[2] == V[3]) {
            if (V[3] == V[4]) {
              if (V[4] == V[5]) {
                band = true;
              }
            }
          }
        }
      }
      if (band == true) {
        pw.println("No Secure");
      } else {
        pw.println("Secure");
      }
    }
    pw.close();
  }
}
