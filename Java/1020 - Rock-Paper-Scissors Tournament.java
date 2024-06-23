import java.io.*;

public class RockPaperScissorsTournament1020 {

  public static void main(String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    OutputStreamWriter osw = new OutputStreamWriter(System.out);
    BufferedWriter bw = new BufferedWriter(osw);
    String[] line;
    int n, k, game, p1, p2;
    String m1, m2;
    float[] win;
    float[] loser;
    boolean m = false;
    while (true) {
      line = br.readLine().split("\\s+");
      if (line[0].equals("0")) {
        break;
      }
      n = Integer.parseInt(line[0]);
      k = Integer.parseInt(line[1]);
      win = new float[n + 1];
      loser = new float[n + 1];
      game = k * n * (n - 1) / 2;
      while (game-- > 0) {
        line = br.readLine().split("\\s+");
        p1 = Integer.parseInt(line[0]);
        m1 = line[1];
        p2 = Integer.parseInt(line[2]);
        m2 = line[3];
        int result = getResult(m1, m2);
        if (result == 1) {
          win[p1]++;
          loser[p2]++;
        } else if (result == -1) {
          win[p2]++;
          loser[p1]++;
        }
      }
      if (m) {
        System.out.println("");
      }
      m = true;
      for (int i = 1; i < win.length; i++) {
        if (win[i] + loser[i] == 0) {
          System.out.println("-");
        } else {
          float pro = (float) win[i] / (win[i] + loser[i]);
          System.out.printf("%.3f\n", pro);
        }
      }
    }
  }

  private static int getResult(String m1, String m2) {
    if (m1.equals(m2)) {
      return 0;
    }
    if (m1.startsWith("p")) {
      if (m2.startsWith("r")) {
        return 1;
      } else {
        return -1;
      }
    }
    if (m1.startsWith("s")) {
      if (m2.startsWith("p")) {
        return 1;
      } else {
        return -1;
      }
    }
    if (m1.startsWith("r")) {
      if (m2.startsWith("s")) {
        return 1;
      } else {
        return -1;
      }
    }
    return 0;
  }
}
