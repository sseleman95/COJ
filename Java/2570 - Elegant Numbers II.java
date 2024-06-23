import java.util.Scanner;
public class main{
public static void main(String[]args){
	Scanner l=new Scanner(System.in);
	for(int j=0;j<2000000;j++){
int x=l.nextInt();
String s=Integer.toString(x);
String v="";
for(int i=s.length()-1;i>=0;i--){
v+=s.charAt(i);
}


int y=Integer.parseInt(v);
if(y>x){
	System.out.println("YES");
}
else{
	System.out.println("NO");
}

	}

}
}
