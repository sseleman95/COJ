import java.util.Scanner;
import java.text.DecimalFormat;
public class Diagonal{
public static void main(String[]args){
	Scanner l=new Scanner(System.in);
	DecimalFormat redondeo=new DecimalFormat("0");
	int d=l.nextInt();
	double temp;
        
	int cont=0;
while(d>0){
    cont++;
d=d*2;
temp=Math.sqrt(9.00+(4.00*d));
if(temp<0){
    temp*=-1;
}
temp+=3.00;
temp/=2.00;
temp=Math.ceil(temp);
System.out.println("Case "+cont+":"+" "+redondeo.format(temp));
d=l.nextInt();
}
}
}