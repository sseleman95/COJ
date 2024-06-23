import java.util.Scanner;
import java.util.ArrayList;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
ArrayList<String> total = new ArrayList<String>();
String posicion="";
int n=l.nextInt();
for(int i=0;i<n;i++){
posicion=l.next();
if(posicion.charAt(0)=='a'){
int x=Integer.parseInt(""+posicion.charAt(1));
if(x%2!=0){
	total.add("WHITE");
}
else{
	total.add("BLACK");
}
}
if(posicion.charAt(0)=='b'){
int x=Integer.parseInt(""+posicion.charAt(1));
if(x%2==0){
	total.add("WHITE");
}
else{
	total.add("BLACK");
}
}
if(posicion.charAt(0)=='c'){
int x=Integer.parseInt(""+posicion.charAt(1));
if(x%2!=0){
	total.add("WHITE");
}
else{
	total.add("BLACK");
}
}
if(posicion.charAt(0)=='d'){
int x=Integer.parseInt(""+posicion.charAt(1));
if(x%2==0){
	total.add("WHITE");
}
else{
	total.add("BLACK");
}
}
if(posicion.charAt(0)=='e'){
int x=Integer.parseInt(""+posicion.charAt(1));
if(x%2!=0){
	total.add("WHITE");
}
else{
	total.add("BLACK");
}
}
if(posicion.charAt(0)=='f'){
int x=Integer.parseInt(""+posicion.charAt(1));
if(x%2==0){
	total.add("WHITE");
}
else{
	total.add("BLACK");
}
}
if(posicion.charAt(0)=='g'){
int x=Integer.parseInt(""+posicion.charAt(1));
if(x%2!=0){
	total.add("WHITE");
}
else{
	total.add("BLACK");
}
}
if(posicion.charAt(0)=='h'){
int x=Integer.parseInt(""+posicion.charAt(1));
if(x%2==0){
	total.add("WHITE");
}
else{
	total.add("BLACK");
}
}
}
for(int i=0;i<total.size();i++){
			
		System.out.println(total.get(i));
		}
}
}