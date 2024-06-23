import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
String s=l.next();
while(true){
int cont=0;
System.out.println(s);
for(int i=0;i<s.length();i++){
if(s.charAt(i)=='1'){
cont++;
}
}
if(cont==1){
break;
}else{
s=Integer.toBinaryString(cont); 
}

}
}
}