import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class main{
	public static void main(String[]arg){
		Scanner l=new Scanner(System.in);
		int c=Integer.parseInt(l.nextLine());
		while(c-- !=0){
			int n=Integer.parseInt(l.next());
			int d=Integer.parseInt(l.next());
			String f=l.next();
			int [] ar=new int [n];
			int s=0;
			for(int p=0;p<n;p++)
				ar[p]=Integer.parseInt(l.next());
			Arrays.sort(ar);
			if(f.equals("regular")){
				n-=1;
				while(d-- !=0){
					s+=ar[n];
					n--;
				}
			}else{
				for(int u=0;u<d;u++)
					s+=ar[u];
				}
			System.out.println(s);
		}
	}
}