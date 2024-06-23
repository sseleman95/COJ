import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prueba {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in),
      1024 * 8
    );

    int casos = Integer.parseInt(br.readLine());

    for (int i = 0; i < casos; i++) {
      int n = Integer.parseInt(br.readLine());
      char mat[][] = new char[n][n];

      for (int x = 0; x < n; x++) {
        String line = br.readLine();

        for (int y = 0; y < n; y++) {
          mat[x][y] = line.charAt(y);
        }
      }

      System.out.println(getLargetsSquare(mat, n));
    }
  }

  public static boolean checkSquare(
    int xmin,
    int ymin,
    int xmax,
    int ymax,
    char arr[][]
  ) {
    for (int x = xmin; x <= xmax; x++) {
      for (int y = ymin; y <= ymax; y++) {
        if (arr[x][y] == '#') return false;
      }
    }

    return true;
  }

  public static int getLargetsSquare(char arr[][], int n) {
    int largest = 0;
    int x = 0, y = 0, auxX = 0, auxY = 0;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (arr[i][j] == '#') continue;

        auxX = i;
        auxY = j;
        do {
          x = auxX;
          y = auxY;
          if (x >= n || y >= n) break;

          if (checkSquare(i, j, x, y, arr)) {
            int aux = (x - i) + 1;
            if (aux > largest) {
              largest = aux;
            }
          } else break;

          auxX = x + 1;
          auxY = y + 1;
        } while (arr[x][y] != '#');
      }
    }

    return largest;
  }
}
