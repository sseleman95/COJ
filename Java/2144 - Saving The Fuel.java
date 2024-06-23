import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Locale;
import java.util.StringTokenizer;

class Main {

  void algoritmo() throws IOException {
    int K, N, D, dif, Pi[];
    K = nextInt();
    for (; K > 0; K--) {
      N = nextInt();
      D = nextInt();
      Pi = new int[N];
      int sum = 0;
      if (next().charAt(0) == 'i') {
        captureWeights(Pi, N);
        for (int i = 0; i < D; i++) sum += Pi[i];
      } else {
        captureWeights(Pi, N);
        dif = N - D;
        N--;
        for (; N >= dif; N--) sum += Pi[N];
      }
      out.println(sum);
    }
  }

  void captureWeights(int[] P, int N) throws IOException {
    for (int i = 0; i < N; i++) {
      P[i] = nextInt();
    }
    Arrays.sort(P);
  }

  private BufferedReader in;
  private PrintWriter out;
  private StringTokenizer st;

  private void eat(String str) {
    st = new StringTokenizer(str);
  }

  String next() throws IOException {
    while (!st.hasMoreTokens()) {
      String line = in.readLine(); /
      if (line == null) {
        return null;
      }
      eat(line);
    }
    return st.nextToken();
  }

  int nextInt() throws IOException {
    return Integer.parseInt(next());
  }

  public static void main(String[] args) throws IOException {
    new Main();
  }

  Main() throws IOException {
    Locale.setDefault(Locale.US); 
    in = new BufferedReader(new InputStreamReader(System.in));
    out = new PrintWriter(System.out);
    eat(""); 
    algoritmo(); 
    in.close();
    out.close();
  }
}
