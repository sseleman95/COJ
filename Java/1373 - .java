import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class AntiSort {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    PrintWriter pw = new PrintWriter(System.out, false);
    int a = 0, aux;
    int T = Integer.parseInt(br.readLine());
    pw.println(T);
    pw.println();
    for (int i = 0; i < T; i++) {
      br.readLine();
      int N = Integer.parseInt(br.readLine());
      int v[] = new int[N];
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < N; j++) {
        v[j] = Integer.parseInt(st.nextToken());
      }
      Arrays.sort(v);
      for (int j = N - 1; j >= 1; j--) {
        if (v[j] > v[j - 1]) {
          a = j;
          aux = v[a - 1];
          v[a - 1] = v[a];
          v[a] = aux;
          break;
        }
      }
      pw.println(N);
      for (int j = 0; j < N; j++) {
        pw.print(v[j] + " ");
      }
      pw.println();
      aux = v[a - 1];
      v[a - 1] = v[a];
      v[a] = aux;
      for (int j = 0; j < N - 1; j++) {
        if (v[j] < v[j + 1]) {
          aux = v[j];
          v[j] = v[j + 1];
          v[j + 1] = aux;
          break;
        }
      }
      for (int j = N - 1; j >= 0; j--) pw.print(v[j] + " ");
      pw.println();
      if (!(T == (i + 1))) pw.println();
    }
    pw.close();
  }
}
