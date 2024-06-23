import java.util.Scanner;
import java.util.ArrayList;
import java.math.BigInteger;
public class main{
 public static void main(String[]args){
	 Scanner l=new Scanner(System.in);
 ArrayList<Integer> total=new ArrayList<Integer>();
 while(true){
	 int n=l.nextInt();
	 if(n!=0)
		 total.add(n);
	 else
		 break;
	 
 }
 for (int j=0;j<total.size();j++){
	 BigInteger ja=new BigInteger("1");
	 for(int y=0;y<=total.get(j);y++){
		 if(y==2 || y==3 ||y==5 || y==7)
			 ja = ja.multiply(new BigInteger(y +""));
		 else
			 if(y%2!=0&&y%3!=0&&y%5!=0&&y%7!=0)
				 ja=ja.multiply(new BigInteger(y +""));
	 }
	 System.out.println(ja);
	 
 }
 
 }
 
}