import java.io.*;

public class AmateurMeteorologist3935 {

    private static final InputStreamReader isr = new InputStreamReader(System.in);
    private static final BufferedReader br = new BufferedReader(isr);
    private static final OutputStreamWriter osw = new OutputStreamWriter(System.out);
    private static final BufferedWriter bw = new BufferedWriter(osw);

    public static void main(String[] args) throws IOException {
        int d = Integer.parseInt(br.readLine());
        int count = 0;
        String[] weather = new String[d];

        for (int i = 0; i < d; i++) {
            weather[i] = br.readLine();
        }

        if (weather[0].equals("sunny")) {
            count++;
        }
        for (int i = 1; i < d; i++) {
            switch (weather[i]) {
                case "sunny":
                    if (weather[i - 1].equals("sunny")) {
                        count++;
                    }
                    break;
                case "rainy":
                    if (weather[i - 1].equals("rainy")) {
                        count++;
                    } else if (i - 3 >= 0) {
                        if (weather[i - 1].equals("cloudy") && weather[i - 2].equals("cloudy") && weather[i - 3].equals("cloudy")) {
                            count++;
                        }
                    }
                    break;
                case "cloudy":
                    if (!weather[i - 1].equals("sunny") && !weather[i - 1].equals("rainy")) {
                        if (!(i - 3 >= 0)) {
                            count++;
                        }else if (!weather[i - 1].equals("cloudy") || !weather[i - 2].equals("cloudy") || !weather[i - 3].equals("cloudy")) {
                            count++;
                        }
                    }

            }
        }
        bw.append(count + "\n");
        bw.flush();
        bw.close();
    }
}
