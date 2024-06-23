import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
int a=l.nextInt();
double sum=0;
double uno;
double dos;
double y;
int x=0;
int mayor=0;
boolean b=false;
boolean t=true;
int [] arreglo=new int[a];
for(int i=0;i<a;i++){
arreglo[i]=l.nextInt();
}

for(int i=0;i<a;i++){
sum+=arreglo[i];
}
uno=sum*.45;
for(int i=0;i<a;i++){
if(arreglo[i]>=uno){
System.out.println("1");
b=false;
}
}
if(b){
dos=sum*.40;
for(int i=0;i<a;i++){
	if(arreglo[i]>=dos){
x=arreglo[i];
arreglo[i]=0;
break;
}
}
for(int i=0;i<a;i++){
y=arreglo[i]*.10;
if((x-arreglo[i])<y){
	System.out.println("2");
	t=false;
	break;
}
}
if(t){
	System.out.println("1");
}
	
}
}

}