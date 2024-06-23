import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
int a=l.nextInt();
int b=l.nextInt();
int c=l.nextInt();
int sum=0;

if(a>=11){
	if(a>11){
		a-=11;
		sum+=a*1440;
			}
	
		if(b>=11){
			if(b>11){
			b-=11;
			sum+=b*60;
					}
	
				if(c>=11){
					if(c>11){
			c-=11;
		sum+=c;
							}

		System.out.println(sum);
						}else{
							System.out.println(-1);
							}
					}else{
						System.out.println(-1);
						}

		}else{
			System.out.println(-1);
			}

}

}
