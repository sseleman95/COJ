import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);

int a=l.nextInt();
for(int i=0;i<a;i++){
	int n=l.nextInt();
if(n==1){
System.out.println(2);
}else{
if(n%2==0){
n/=2;
if(n%2==0){
while(n%2==0){
n/=2;
}
}
System.out.println(n);
}else{
n*=2;
if(n%2!=0){
while(n%2!=0){
n*=2;
}
}
System.out.println(n);
}

}
}
}

}