import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Semafori {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int lenghtRoad;
        int[][] trafficLight;
        int trafficLightsTotal;
        String readed;
        String[] readedArray;
        //Set up variables
        readed = in.readLine();
        readedArray = readed.split(" ");
        trafficLightsTotal = Integer.parseInt(readedArray[0]);
        lenghtRoad = Integer.parseInt(readedArray[1]);
        trafficLight = new int[trafficLightsTotal + 1][3]; //matrix of trafficLights, each having 0->Distance, 1->Red light duration, 2->Green light duration

        trafficLight[0][0] = 0;

        for (int i = 1; i <= trafficLightsTotal; i++) {
            //Set up variables
            readed = in.readLine();
            readedArray = readed.split(" ");
            trafficLight[i][0] = Integer.parseInt(readedArray[0]); //Distance
            trafficLight[i][1] = Integer.parseInt(readedArray[1]); //Red
            trafficLight[i][2] = Integer.parseInt(readedArray[2]); //Green			
        }

        int totalTime = 0;
        int waitTime = 0;

        for (int i = 1; i < trafficLight.length; i++) {
            totalTime += (trafficLight[i][0] - trafficLight[i - 1][0]);
            waitTime = totalTime % (trafficLight[i][1] + trafficLight[i][2]);
            if (waitTime < trafficLight[i][1]) {
                waitTime = trafficLight[i][1] - waitTime;
                totalTime += waitTime;
            }
        }
        if (lenghtRoad > trafficLight[trafficLight.length - 1][0]) {
            totalTime += lenghtRoad - trafficLight[trafficLight.length - 1][0];
        }
        System.out.println(totalTime);
    }
}
