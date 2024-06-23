import java.util.Scanner;
import java.util.ArrayList;
public class main{
 public static void main(String[]args){
	 Scanner l=new Scanner(System.in);
	 ArrayList<Integer> total=new ArrayList<Integer>();
	  ArrayList<Integer> muertos=new ArrayList<Integer>();
	    ArrayList<Integer> vivos=new ArrayList<Integer>();
	  
	  while(true){
		  boolean m=true;
		  int a=l.nextInt();
	      int b=l.nextInt();
	  for(int i=1;i<=a;i++){
		  total.add(i);
	  }
	 
	 for(int i=0;i<b;i++){
		 muertos.add(l.nextInt());
	 }
	 for(int i=0;i<total.size();i++){
		 m=true;
		 for(int j=0;j<muertos.size();j++){
			 if(total.get(i)==muertos.get(j)){
               m=false;
			 }
		 }
		 if(m){
			 vivos.add(total.get(i));
		 }
	 }
	 if(vivos.size()==0){
		 System.out.println("*");
		 System.out.println("");
	 }else{
	 for(int i=0;i<vivos.size();i++){
		 System.out.print(vivos.get(i)+" ");
	 }
	 System.out.println("");
	 System.out.println("");
	 }
	 
	 
	 total.clear();
	 muertos.clear();
	 vivos.clear();
	 
 }	
 }
	
}