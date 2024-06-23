import java.util.Scanner;
public class main{
public static void main(String[]args){
	Scanner l=new Scanner(System.in);
String s=l.next();
int time=0;
for(int i=0;i<s.length();i++){
if(s.charAt(i)=='A'||s.charAt(i)=='B'||s.charAt(i)=='C'){
time+=3;
}
if(s.charAt(i)=='D'||s.charAt(i)=='E'||s.charAt(i)=='F'){
time+=4;
}
if(s.charAt(i)=='G'||s.charAt(i)=='H'||s.charAt(i)=='I'){
time+=5;
}
if(s.charAt(i)=='J'||s.charAt(i)=='K'||s.charAt(i)=='L'){
time+=6;
}
if(s.charAt(i)=='M'||s.charAt(i)=='N'||s.charAt(i)=='O'){
time+=7;
}
if(s.charAt(i)=='P'||s.charAt(i)=='Q'||s.charAt(i)=='R'||s.charAt(i)=='S'){
time+=8;
}
if(s.charAt(i)=='T'||s.charAt(i)=='U'||s.charAt(i)=='V'){
time+=9;
}
if(s.charAt(i)=='W'||s.charAt(i)=='X'||s.charAt(i)=='Y'||s.charAt(i)=='Z'){
time+=10;
}
}
System.out.println(time);
}
}