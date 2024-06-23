import java.util.Scanner;
import java.math.BigDecimal;
import java.io.IOException;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
BigDecimal x=new BigDecimal("0");
BigDecimal y=new BigDecimal("0");
BigDecimal z=new BigDecimal("0");
BigDecimal t=new BigDecimal("0");
BigDecimal resta=new BigDecimal("1");
int a=0;
int b=0;
while(true){
	try{
t=l.nextBigDecimal();
a=l.nextInt();
b=l.nextInt();

x=t.pow(a);
x=x.subtract(resta);
y=t.pow(b);
y=y.subtract(resta);
z=x.divide(y);
String s=z.toPlainString();
if(s.length()<100){
	System.out.println("("+t+"^"+a+"-1"+")"+"/"+"("+t+"^"+b+"-1"+")"+" "+s);
	
}
else{
	System.out.println("("+t+"^"+a+"-1"+")"+"/"+"("+t+"^"+b+"-1"+")"+" "+"is not an integer with less than 100 digits.");
}

}catch(Exception e){
	System.out.println("("+t+"^"+a+"-1"+")"+"/"+"("+t+"^"+b+"-1"+")"+" "+"is not an integer with less than 100 digits.");
}
}
}
}