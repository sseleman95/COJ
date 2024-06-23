import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
int a=l.nextInt();
for(int h=0;h<a;h++){

int x=l.nextInt();
int[] arreglo=new int[x];
int sum=0;
boolean r=false;
for(int i=0;i<x;i++){
arreglo[i]=l.nextInt();
}

for(int n=0;n<x;n++){
	sum=arreglo[n];
for(int m=1;m<x;m++){
if(sum+arreglo[m]==0){
System.out.println("YES");
r=true;
break;
}
sum+=arreglo[m];
}
sum=0;
if(r){
	break;
}
}
if(r==false){
	System.out.println("NO");
}
}
}
}