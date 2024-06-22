import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = 0;
            while(true){
            	n = in.nextInt();
                if(n != 42){
                    System.out.println(n);
                }else{
                    break;
                }
            }
		}
	}