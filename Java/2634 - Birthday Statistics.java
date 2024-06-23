import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
ArrayList<String> total = new ArrayList<String>();
int enero=0,febrero=0,marzo=0,abril=0,mayo=0,junio=0,julio=0,agosto=0,septiembre=0,octubre=0,noviembre=0,diciembre=0;
int a=l.nextInt();
for(int i=0;i<a;i++){
int x=l.nextInt();
String s=l.next();
StringTokenizer st = new StringTokenizer(s,"/");
String y;
 while (st.hasMoreTokens()) {
	  y=(st.nextToken());
         total.add(y);
 }
 if(total.get(1).equals("1")){
	enero+=1; 
 }
 if(total.get(1).equals("2")){
	 febrero+=1;
 }
 if(total.get(1).equals("3")){
	 marzo+=1;
 }
 if(total.get(1).equals("4")){
	 abril+=1;
 }
 if(total.get(1).equals("5")){
	 mayo+=1;
 }
 if(total.get(1).equals("6")){
	 junio+=1;
 }
 if(total.get(1).equals("7")){
	 julio+=1;
 }
 if(total.get(1).equals("8")){
	 agosto+=1;
 }
 if(total.get(1).equals("9")){
	 septiembre+=1;
 }
 if(total.get(1).equals("10")){
	octubre+=1; 
 }
 if(total.get(1).equals("11")){
	 noviembre+=1;
 }
 if(total.get(1).equals("12")){
	 diciembre+=1;
 }
 total.clear();
 }
 System.out.println("1 "+ enero);
 System.out.println("2 "+ febrero);
 System.out.println("3 "+ marzo);
 System.out.println("4 "+ abril);
 System.out.println("5 "+ mayo);
 System.out.println("6 "+ junio);
 System.out.println("7 "+ julio);
 System.out.println("8 "+ agosto);
 System.out.println("9 "+ septiembre);
 System.out.println("10 "+ octubre);
 System.out.println("11 "+ noviembre);
 System.out.println("12 "+ diciembre);
 
}
 }
	 