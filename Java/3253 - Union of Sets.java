import java.util.Scanner;
import java.util.HashSet;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
HashSet<Integer> discos = new HashSet<Integer>();
int a=l.nextInt();
for(int i=0;i<a;i++){
int c=l.nextInt();
for(int j=0;j<c;j++){
int g=l.nextInt();
discos.add(g);

}
}
System.out.println(discos.size());

}

}