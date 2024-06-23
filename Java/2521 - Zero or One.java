import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
while(l.hasNext()){
int A=l.nextInt();
int B=l.nextInt();
int C=l.nextInt();
if(A!=B&&A!=C){
System.out.println("A");
}
if(B!=A&&B!=C){
System.out.println("B");
}
if(C!=B&&C!=A){
System.out.println("C");
}
if(A==B&&A==C||B==A&&B==C||C==A&&C==B){
System.out.println("*");
}
}
}
}