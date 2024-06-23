import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Fractal {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {

        int n = Integer.parseInt(in.readLine());
        String readed;
        String[] readedArray;
        int L;
        int max;
        double result;
        int iteration;

        for (int i = 0; i < n; i++) {
            readed = in.readLine();
            readedArray = readed.split(" ");

            L = Integer.parseInt(readedArray[0]);
            max = Integer.parseInt(readedArray[1]);
            result = -1;
            iteration = 0;
            double aux;

            if (L <= max) {
                iteration++;
                result = L;
                while (result <= max) {
                    aux = 1;
                    for (int j = 0; j < iteration; j++) {
                        aux = aux / 3;
                    }
                    result = (L * aux * Math.pow(5, iteration));
                    iteration++;
                }
            }

            System.out.println(iteration - 2);
        }
    }
}
