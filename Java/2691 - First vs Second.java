import java.util.Scanner;
public class main{
public static void main(String[]args){
int n,m,p=0,s=0,i;
Scanner l=new Scanner(System.in);
n=l.nextInt();
m=l.nextInt();
for(i=0;i<n;i++){
p+=l.nextInt();
}
for(i=0;i<m;i++){
s+=l.nextInt();
}
if(p==s){
System.out.println("tie");
}
else{
if(p>s){
System.out.println("first win");
}
if(p<s){
System.out.println("second win");
}
}
}
}