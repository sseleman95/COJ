import java.util.Scanner;
import java.math.BigInteger;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
BigInteger n=new BigInteger("0");
int x=l.nextInt();
for(int i=0;i<x;i++){
n=l.nextBigInteger();
String s=n.toString(2);
if(s.indexOf('1')!=-1&&s.indexOf('0')!=-1){
System.out.println("YES");
}
else{
System.out.println("NO");
}
}

}

}