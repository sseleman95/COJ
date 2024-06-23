import java.util.Scanner;
public class num2625{
	public static void main(String [] arg){
		Scanner l = new Scanner(System.in);
		int a=l.nextInt();
		int b=l.nextInt();
		char [] c ={'O','I','E'};
		char [] c1 ={'I','E','O'};
		char [] c2 ={'E','O','I'};
		int k=0;
		while(a-- !=0){
			int co=0,s=0;
			if(k==3)
				k=0;
			if(k==0){
				while(co<b){
				if(s==3)
					s=0;
				System.out.print(c[s]);
				s++;
				co++;
			}
			System.out.println("");
			}
			if(k==1){
				while(co<b){
				if(s==3)
					s=0;
				System.out.print(c1[s]);
				s++;
				co++;
			}
			System.out.println("");
			}
			if(k==2){
				while(co<b){
				if(s==3)
					s=0;
				System.out.print(c2[s]);
				s++;
				co++;
			}
			System.out.println("");
			}
			k++;
		}
	}
}