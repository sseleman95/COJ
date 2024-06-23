import java.util.Scanner;
public class main{
public static void main(String[]args){
	Scanner l=new Scanner(System.in);
int n=l.nextInt();
int cont=1;
while(n!=0){
//n=(n*(n+1)*((2*n)+1))/6;

System.out.println("Case"+" "+cont+":"+"\n"+"n"+" "+"="+" "+n+","+" "+"diamonds"+" "+"="+" "+(n*(n+1)*((2*n)+1))/6);
cont++;
n=l.nextInt();
}


}

}