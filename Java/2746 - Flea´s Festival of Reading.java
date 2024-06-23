import java.util.Scanner;
public class main{
	public static void main(String[]args){
		Scanner l=new Scanner(System.in);
		String s=l.next();
		int mika=0,boga=0,i;
		
		for(i=0;i<s.length();i++){
		if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
		mika++;
		}else{
		boga++;
		}
		}
		System.out.println(mika+" "+boga);
		}
		}
