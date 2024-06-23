import java.util.Scanner;
public class main{
static String[][] matriz;
static Scanner l=new Scanner(System.in);
static int a,b;
//int i,j;
static int cont=0;
public void llenado(){
a=l.nextInt();b=l.nextInt();


matriz=new String[a][b];
for(int x=0;x<a;x++){
for(int y=0;y<b;y++){
	String a=l.nextChar();
matriz[x][y]=a;

}

}
}
public int checado(){
for(int i=0;i<a;i++){
for(int j=0;j<b;j++){
	if(a==1&&b==1){
		
}
else{

if(i==0&&j==0&&a>1&&b>1){
if(matriz[i+1][j].equals("-")||matriz[j+1].equals("-")&&matriz[i][j].equals("+")){
cont+=1;
}
}
if(i==0&&j==b-1){
if(matriz[i+1][j].equals("-")||matriz[j-1].equals("-")&&matriz[i][j].equals("+")){
cont+=1;
}
}
if(i==a-1&&j==0){
if(matriz[i-1][j].equals("-")||matriz[j+1].equals("-")&&matriz[i][j].equals("+")){
cont+=1;
}
}
if(i==a-1&&j==b-1){
if(matriz[i-1][j].equals("-")||matriz[j-1].equals("-")&&matriz[i][j].equals("+")){
cont+=1;
}
}
if(i!=0&&i!=a-1&&j==0){
if(matriz[i-1][j].equals("-")||matriz[i+1][j].equals("-")||matriz[i][j+1].equals("-")&&matriz[i][j].equals("+")){
cont+=1;
}
}
if(i==0&&j!=0&&j!=b-1){
if(matriz[i+1][j].equals("-")||matriz[i][j-1].equals("-")||matriz[i][j+1].equals("-")&&matriz[i][j].equals("+")){
cont+=1;
}
}
if(i==a-1&&j!=0&&j!=b-1){
if(matriz[i-1][j].equals("-")||matriz[i][j-1].equals("-")||matriz[i][j+1].equals("-")&&matriz[i][j].equals("+")){
cont+=1;
}
}
if(j==b-1&&i!=b-1&&i!=a-1){
if(matriz[i+1][j].equals("-")||matriz[i-1][j].equals("-")||matriz[i][j-1].equals("-")&&matriz[i][j].equals("+")){
cont+=1;
}
}
if(i!=0&&i!=a-1&&j!=0&&j!=b-1){
	if(matriz[i+1][j].equals("-")||matriz[i-1][j].equals("-")||matriz[i][j+1].equals("-")||matriz[i][j-1].equals("-")&&matriz[i][j].equals("+")){
	cont +=1;
}
}
}
}
}

return cont;

}

public static void main(String[]args){
	main m=new main();
	m.llenado();
	
	System.out.println(m.checado());
	
}
}


