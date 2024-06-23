import java.util.Scanner;
public class pizza{
	public static void main(String [] arg){
		Scanner l = new Scanner(System.in);
		int [] a= new int [11];
		for(int y=0;y<8;y++)
			a[y]=l.nextInt();
		
		a[8]=a[0]; a[9]=a[1]; a[10]=a[2];
		int y=0;
		for(int u=0;u<8;u++){
			if(y<=a[u]+a[u+1]+a[u+2]+a[u+3])
				y=a[u]+a[u+1]+a[u+2]+a[u+3];
		}
		System.out.println(y);
	}
}