import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
int suma=0;
while(l.hasNext()){
String s=l.next();
int x=l.nextInt();

if(s.equals("suma")){
suma+=x;
}
if(s.equals("resta")){
suma-=x;
}
}
System.out.println("resultado: "+suma);

}
}