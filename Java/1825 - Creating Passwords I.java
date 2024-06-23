import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;
public class main{
public static void main(String[]args){
	Scanner l=new Scanner(System.in);
    int p=Integer.parseInt(l.nextLine());
	for(int u=0;u<p;u++){
		ArrayList<String> total = new ArrayList<String>();
String x=l.next();
String s=l.nextLine();
String y;
for(int i=0;i<3;i++){
	char c=x.charAt(i);
System.out.print(c);
}
StringTokenizer st = new StringTokenizer(s," ");
     while (st.hasMoreTokens()) {
		 total.add(st.nextToken());
     }
	 for(int i=0;i<total.size();i++){
		
		 y = (""+total.get(i)+"*");
		 if(i==total.size()-1){
			y = (""+total.get(i)); 
		 }
		 System.out.print(y);
		 
	 }
	 for(int i=3;i<6;i++){
	char c=x.charAt(i);
System.out.print(c);
}
System.out.println();
}
}
}