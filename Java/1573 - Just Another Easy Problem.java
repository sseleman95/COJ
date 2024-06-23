import java.util.Scanner;
public class JustAnotherEasyProblem{
public static void main(String[]args){
	Scanner l=new Scanner(System.in);
	int a=l.nextInt();
        long sum=0;
        String hexa;
	while(a-->0){
            sum=0;
hexa=l.next();

long num=Long.parseLong(hexa,16);
sum=(num*(num+1))/2;
if(sum==1){
    System.out.println("YES");
}
else if(sum%num!=0||sum==num){
	System.out.println("NO");
}else{
	System.out.println("YES");
}
	}
}
}