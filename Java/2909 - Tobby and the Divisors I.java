import java.util.*;
import java.io.*;
public class num2909{
	static int en;
	static int nu;
	static int b;
	static int ja;
	static int  factor (int a){
		b=2;
		ja=1;
		int aq=1;
		while(a!=1){
			if(a%b==0){
				a/=b;
				aq++;
			}else{
				b++;
				ja*=aq;
				aq=1;
			}
		}
		 return (ja*aq);
	}
	public static void main(String ... arg){
		Scanner l =new Scanner(System.in);
		PrintWriter std = new PrintWriter(System.out);
		en=l.nextInt();
		int p,t,te;
		while(en-- !=0){
			nu=l.nextInt();
			if(nu==1){
				std.println(1);
				continue;
			}
			p=1;
			t=1;
			for(int a=2;a<=nu;a++){
				te=factor(a);
				if(te>t){
					t=te;
					p=a;
				}
			}	

			std.println(p);
		}
		std.close();
	}
}