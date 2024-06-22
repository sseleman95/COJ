import java.util.Scanner;
public class JavaApplication4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=1,r=1;
        while (l!=0) { 
            l=sc.nextInt(); r=sc.nextInt();
            if (l==0 && r==0) {
                break;
            }
            System.out.println(l+r);
        }
    }
}