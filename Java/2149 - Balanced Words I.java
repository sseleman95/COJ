import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int upper = 0, normal = 0, c = 0;
       
        c = sc.nextInt();
        
        for(int i = 0; i < c; i++) {
            String str =  sc.next();
            upper = 0;
            normal = 0;
            for(int j = 0; j < str.length(); j++){

                if(Character.isUpperCase(str.charAt(j))){
                    upper++;
                }else{
                    normal++;
                }
            }
            if(upper == normal){
                System.out.println("SI");
            }else {
                System.out.println("NO");
            }
        }
       
    }
}
