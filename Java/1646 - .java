import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    String line;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while ((line = br.readLine()) != null) {
      if (line.length() == 0) return;
      StringTokenizer st = new StringTokenizer(line);
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      int ans = 0;
      line = br.readLine();
      st = new StringTokenizer(line);
      for (int i = 0; i < a; i++) {
        ans ^= Integer.parseInt(st.nextToken());
      }
      if (ans > 0) {
        System.out.println("Vida");
      } else {
        System.out.println("Andrea");
      }
    }
  }
}
