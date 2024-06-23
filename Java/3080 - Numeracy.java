
import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
int a=l.nextInt();
for(int i=0;i<a;i++){
double r=0;
double b=l.nextInt();
String s=l.next();
double c=l.nextInt();
if(s.equals("+")){
r=b+c;
}
if(s.equals("-")){
r=b-c;
}
if(s.equals("/")){
r=b/c;
}
if(s.equals("*")){
r=b*c;
}
String x=l.next();
double d=l.nextInt();
if(r==d){
System.out.println("Yes");
}
else{
System.out.println("No");	
}
}


}
}