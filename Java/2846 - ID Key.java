import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
int a=l.nextInt();
for(int j=0;j<a;j++){
String s=l.next();
String z="";
String y="";
int multi;
int suma=0;
for(int i=0;i<s.length();i++){
suma+=s.charAt(i)-'0';
}

for(int i=10;i<13;i++){
z+=s.charAt(i);
}
multi=Integer.parseInt(z);
multi*=10;
multi+=suma;
if(multi<1000){
	multi+=1000;
	y=Integer.toString(multi);
if(y.length()>4){
	for(int i=y.length()-4;i<y.length();i++){
	System.out.print(y.charAt(i));
	}
	System.out.println("");
}else{
	System.out.println(multi);
}
}else{
	y=Integer.toString(multi);
if(y.length()>4){
	for(int i=y.length()-4;i<y.length();i++){
	System.out.print(y.charAt(i));
	}
	System.out.println("");
	
}else{
	System.out.println(multi);
}
}
}
}
}