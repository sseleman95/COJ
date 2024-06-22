import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String cn1 = sc.nextLine();
        String cn2 = sc.nextLine();
        
        int a = Integer.parseInt(cn1.replaceAll(" ", ""));
        int b = Integer.parseInt(cn2.replaceAll(" ", ""));
        int c = a + b;
        if(c == 11111){
            System.out.println("Y");
        }else{
            System.out.println("N");
        }
    }
}
