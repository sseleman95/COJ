import java.util.Scanner;
import java.math.BigInteger;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
BigInteger multiplicador=new BigInteger("17");
String s=l.next();
BigInteger n=new BigInteger(s, 2);
n=n.multiply(multiplicador);
s=n.toString(2);
System.out.println(s);
}
}