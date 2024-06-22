
import java.io.*;

public class PickingDiamonds3089 {

    private static InputStreamReader isr = new InputStreamReader(System.in);
    private static final BufferedReader br = new BufferedReader(isr);
    private static final OutputStreamWriter osw = new OutputStreamWriter(System.out);
    private static final BufferedWriter bw = new BufferedWriter(osw);

    public static void main(String[] args) throws IOException {
        int sum = 0, max = 0, e = 0;
        String[] line;
        boolean imp = false;
        for (int i = 1; i <= 7; i++) {
            line = br.readLine().split("\\s+");
            sum =0;
            for (int j = 1; j <= 7; j++) {
                sum += (poit(j) * Integer.parseInt(line[j - 1]));
            }
            if (max == sum) {
                imp = true;
            }
            if (max < sum) {
                e = i;
                max = sum;
                imp = false;
            }
        }
        if (imp) {
            System.out.println("Blancanieve y los siete enanitos");
        } else {
            System.out.println(name(e));
        }
    }

    private static String name(int i) {
        switch (i) {
            case 1:
                return "dormilon";
            case 2:
                return "feliz";
            case 3:
                return "mudito";
            case 4:
                return "timido";
            case 5:
                return "grunnon";
            case 6:
                return "mocoso";
            case 7:
                return "sabio";
        }
        return null;
    }

    private static int poit(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 5;
            case 3:
                return 10;
            case 4:
                return 15;
            case 5:
                return 20;
            case 6:
                return 25;
            case 7:
                return 30;
        }
        return 0;
    }

}
