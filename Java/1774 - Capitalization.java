import java.util.Scanner;

public class Capitalization {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        boolean state  = false;
        
        for(int i = 1; i < str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                state = true;
            }
        }
        if(state == false){
            System.out.println(str);
        } else {
            String x = "";
            for(int i = 0; i < str.length(); i++){
                if(Character.isUpperCase(str.charAt(i))){
                    x += Character.toLowerCase(str.charAt(i));
                }else {
                    x += Character.toUpperCase(str.charAt(i));
                }
            }
            System.out.println(x);
        }
    }
            
}
