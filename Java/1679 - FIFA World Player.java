import java.util.Scanner;
public class main{
public static void main(String[]args){
	Scanner l=new Scanner(System.in);
	int a=l.nextInt();
	double mayor=0;
	String x="";
	String s;
	for(int i=0;i<a;i++){
	s=l.next();
	int PA=l.nextInt();
	int PJ=l.nextInt();
	int G=l.nextInt();
	int A=l.nextInt();
	int TA=l.nextInt();
	int TR=l.nextInt();
	double FACTOR=Math.log10(PA)+PJ+2*G+A-(TA+2*TR);
	if(FACTOR>mayor){
	mayor=FACTOR;
	x=s;
	}
	}
	System.out.println(x);
	
}
}