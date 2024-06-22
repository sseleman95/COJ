import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class COJ2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {

			String[] list = br.readLine().split(" ");
			
			int t = Integer.parseInt(list[0]);
			long c = Long.parseLong(list[1]);

			for (int j = 0; j < t; j++) {
				c=c+(c/(t-1));
			}
			System.out.println(c);
		}
	}
}
