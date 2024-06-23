
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;



/**
 *
 * @author LESH
 */
public class Herman {

   
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        DecimalFormat f=new DecimalFormat("0.0000");
        f.setRoundingMode(RoundingMode.FLOOR);
        int radio=l.nextInt();
        double eucli=Math.PI*Math.pow(radio,2);
        double taxi=Math.sqrt(4)*Math.pow(radio,2);
        System.out.println(f.format(eucli));
        System.out.println(f.format(taxi));
        
       
    }
    
}
