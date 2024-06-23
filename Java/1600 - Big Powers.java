import java.math.BigInteger;
import java.util.Scanner;
public class main{
public static void main(String[]args){
	Scanner l=new Scanner(System.in);

BigInteger cero=new BigInteger("0");
BigInteger n=new BigInteger("0");
BigInteger mod=new BigInteger("10");
n=l.nextBigInteger();
int m=l.nextInt();
int res=n.compareTo(cero);
while(true){
	if(m==0&&res==0){
		break;
	}
n=n.pow(m);

System.out.println(n.mod(mod));

n=l.nextBigInteger();
m=l.nextInt();

res=n.compareTo(cero);

}
}

}