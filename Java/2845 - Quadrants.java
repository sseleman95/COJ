import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
double x,y;
while(true){
x=l.nextDouble();
y=l.nextDouble();
if(x>0&&y>0){
System.out.println("Q1");
}
if(x<0&&y>0){
System.out.println("Q2");
}
if(x<0&&y<0){
System.out.println("Q3");
}
if(x>0&&y<0){
System.out.println("Q4");
}
if(x==0||y==0){
System.out.println("AXIS");
}
if(x==0&&y==0){
break;
}

}

}
}