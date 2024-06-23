import java.util.Scanner;
import java.text.DecimalFormat;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
DecimalFormat redondeo = new DecimalFormat("0.000");
double k=0,mayor=0;
double PI=3.14159;
int a=l.nextInt();
for(int i=0;i<a;i++){
String s=l.next();
if(s.equals("C")){
double R=l.nextDouble();
double H=l.nextDouble();
k=(0.333333333)*PI*(R*R)*H;

}
if(s.equals("L")){
double R=l.nextDouble();
double H=l.nextDouble();
k=PI*(R*R)*H;

}
if(s.equals("S")){
double R=l.nextDouble();
k=(4.0/3.0)*PI*(R*R*R);

}
if(k>mayor){
mayor=k;
}
}
System.out.print(redondeo.format(mayor));
}
}