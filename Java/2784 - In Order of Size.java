import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
int limite=l.nextInt();
int i,j,aux,mayor=0;
int arreglo[]=new int[limite];
for(i=0;i<limite;i++){
	arreglo[i]=l.nextInt();
	if(arreglo[i]>mayor)
	mayor=arreglo[i];
}
for(i=0;i<limite;i++){
			for(j=i+1;j<limite;j++){
				if(arreglo[i]>arreglo[j]){
					aux=arreglo[i];
					arreglo[i]=arreglo[j];
					arreglo[j]=aux;
				}
			}
		}
		System.out.print(mayor+" ");
		for(i=0;i<limite-1;i++){
	System.out.print(arreglo[i]+" ");
	}
}
}