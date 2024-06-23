import java.util.Scanner;
public class main{
public static void main(String[]args){
	Scanner l=new Scanner(System.in);
	String s;
	int cont=0;
	int sum=0;
	int numero;
	int i;
	int x;
	while(l.hasNext()){
cont=0;
sum=0;
s=l.next();

for(i=0;i<s.length();i++){
if(s.charAt(i)=='6'){
cont++;
break;
}
}
if(s.charAt(0)=='-'){
for(i=1;i<s.length();i++){
sum+= s.charAt(i) - '0';
}
}else{
for(i=0;i<s.length();i++){
sum+= s.charAt(i) - '0';
}
}
x=s.charAt(s.length()-1) - '0';
if(cont!=0&&sum%3==0&&(s.charAt(s.length()-1)=='0'||x%2==0)&&sum%6==0){
	System.out.println("EVIL");
}else{
	System.out.println("GOOD");
}
}

}

}