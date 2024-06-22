import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        String n = "";
        
        for(int i = 0; i < c; i++){
            n = in.next();
            String s = String.format("%0" + n.length() + "d", 0).replace('0', '0');
            System.out.println(n + "" + s);
        }
    }
}