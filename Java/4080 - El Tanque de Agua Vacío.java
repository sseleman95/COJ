import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class COJ2 {

  public static void main(String[] args) throws IOException {
    //Scanner sc = new Scanner(System.in);
    //int n = sc.nextInt();

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    for (int i = 0; i < n; i++) {
      //Double c = sc.nextDouble(), t = sc.nextDouble();
      String[] list = br.readLine().split(" ");

      double c = Double.parseDouble(list[0]), t = Double.parseDouble(list[1]);

      long r = (long) (Math.ceil((c / t) - ((t - 1) / 2)));

      if (r < 0) {
        System.out.println(1);
      } else {
        System.out.println(r);
      }
    }
  }
}
