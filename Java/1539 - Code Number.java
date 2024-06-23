import java.util.Scanner;
public class main{
public static void main(String[]args){
	Scanner l=new Scanner(System.in);
	String a;
 String parrafo="";
do 
{ 
 
a=l.nextLine();
if (!a.equals("")) {
 parrafo+=a;
}
} 
while (!a.equals(""));
System.out.print(parrafo); 
}
}