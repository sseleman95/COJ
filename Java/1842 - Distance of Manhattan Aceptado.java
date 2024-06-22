import java.util.*;

public class Main
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt(), x1 = 0, y1 = 0, x2 = 0, y2 = 0;
        
        for(int i = 0; i < c; i++){
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            int distance = Math.abs(x1 - x2) + Math.abs(y1 - y2);
            System.out.println(distance);
        }
        
    }
}