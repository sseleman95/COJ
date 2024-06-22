
import java.util.*;

public class COJ2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s1 = sc.next();
            String s2 = sc.next();
            String answer = "YES";
            
            int length = s1.length();
            
            if(s1.length() == s2.length()){
                for (int j = 0; j < length; j++) {
                    if((s1.charAt(j) == s2.charAt(length - j - 1) && s1.charAt(length - j - 1) == s2.charAt(j)) || s1.charAt(j) == s2.charAt(j)){
                      
                    }else{
                        answer = "NO";
                    }
                }                
            }else{
                answer = "NO";
            }
            System.out.println(answer);

            
        }
        
    }
}