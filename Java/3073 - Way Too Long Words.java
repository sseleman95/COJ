import java.util.Scanner;
public class main{
public static void main(String[]args){
	Scanner l=new Scanner(System.in);
	int a=l.nextInt();
	for(int j=0;j<a;j++){
String s=l.next();
int x=s.length();
String c="";
String r="";
if(x>10){
for(int i=1;i<x-1;i++){
	c+=s.charAt(i);
	
}
x-=2;
r=Integer.toString(x);
s=s.replaceAll(c,r);
System.out.println(s);	
	
}
else{
	System.out.println(s);
}
	}
}
}