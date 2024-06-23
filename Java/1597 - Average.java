import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.text.DecimalFormat;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
ArrayList<Integer> total=new ArrayList<Integer>();
DecimalFormat redondeo = new DecimalFormat("0.000000");
int H=l.nextInt();
int L=l.nextInt();
int N=l.nextInt();
while(true){
	if(H==0&&L==0&&N==0){
		break;
	}
int x;
double sum=0;
for(int i=0;i<N;i++){
	x=l.nextInt();
	total.add(x);
}
Collections.sort(total);
for(int i=0;i<H;i++){
	total.remove(total.size()-1);	
}
for(int i=0;i<L;i++){
	total.remove(0);	
}
for(int i=0;i<total.size();i++){
	sum+=total.get(i);
}

sum/=total.size();
System.out.println(redondeo.format(sum));
total.clear();
H=l.nextInt();
L=l.nextInt();
N=l.nextInt();
}
}
}
