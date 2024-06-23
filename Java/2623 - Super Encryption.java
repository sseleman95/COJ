import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
String s=l.next();
int x=s.length()-1;
String h="";
int y;
if(x%2==0){
	x-=1;
	y=x/2;
	for(int i=y;i>=0;i--){
h+=s.charAt(i);
}
h+=s.charAt(y+1);
for(int i=x+1;i>y+1;i--){
	h+=s.charAt(i);

}
}else{
y=x/2;
for(int i=y;i>=0;i--){
h+=s.charAt(i);
}
for(int i=x;i>y;i--){
	h+=s.charAt(i);

}

}
System.out.println(h);

}

}