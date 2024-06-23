import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
int a=l.nextInt();
int primero=0;
int segundo=0;
for(int i=0;i<a;i++){
String s=l.next();
String x=l.next();
if(s.equals("rock")&&x.equals("scissors")){
primero+=1;
}
if(s.equals("scissors")&&x.equals("paper")){
primero+=1;
}
if(s.equals("paper")&&x.equals("rock")){
primero+=1;
}
if(s.equals("rock")&&x.equals("paper")){
segundo+=1;
}
if(s.equals("scissors")&&x.equals("rock")){
segundo+=1;
}
if(s.equals("paper")&&x.equals("scissors")){
segundo+=1;
}
}
if(primero>segundo){
System.out.println("A win");
}
if(primero<segundo){
System.out.println("B win");
}
if(primero==segundo){
System.out.println("tied");
}
}
}