import java.util.Scanner;

public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
int x;

x=l.nextInt();
for(int i=0;i<x;i++){
	
 int a=l.nextInt();
 int b=l.nextInt();
 if(b!=16){
String num = Integer.toString(a, b);
System.out.println(num.toUpperCase());
	}
if(b==16){
String hex = Integer.toHexString(a);
System.out.println(hex.toUpperCase());
}
}
}
}