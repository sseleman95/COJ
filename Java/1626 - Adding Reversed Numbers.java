import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
int f=l.nextInt();
for(int j=0;j<f;j++){

String a=l.next();
String b=l.next();
boolean p=true;
boolean u=false;
String x="",y="",resultado1="",resultado2="";

for(int i=a.length()-1;i>=0;i--){
x+=a.charAt(i);
}
for(int i=b.length()-1;i>=0;i--){
y+=b.charAt(i);
}


int n=Integer.parseInt(x);


int m=Integer.parseInt(y);


n+=m;

resultado1=Integer.toString(n);

for(int i=resultado1.length()-1;i>=0;i--){
resultado2+=resultado1.charAt(i);
}
for(int i=0;i<resultado2.length();i++){
	if(p){
	if(resultado2.charAt(i)!='0'){
		p=false;
		u=true;
	}
	}
	if(u){
	System.out.print(resultado2.charAt(i));
	}
	
}
System.out.println("");

}


}
}