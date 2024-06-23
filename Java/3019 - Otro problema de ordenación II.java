import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
int limite=l.nextInt();
int i,j,aux;
int arreglo[]=new int[limite];
for(i=0;i<limite;i++){
	arreglo[i]=l.nextInt();
}
int r=0;
for(i=0;i<limite;i++){
			for(j=i+1;j<limite;j++){
				if(arreglo[i]>arreglo[j]){
					aux=arreglo[i];
					arreglo[i]=arreglo[j];
					arreglo[j]=aux;
					r+=2;
				}
			}
		}
		for(i=0;i<limite;i++){
	System.out.print(arreglo[i]);
	}
	System.out.print(" "+r);
		
}
}