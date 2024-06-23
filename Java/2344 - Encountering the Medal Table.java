import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
public class main{
public static void main(String[]args){
ArrayList<Medalla> list=new ArrayList<Medalla>();
Scanner l=new Scanner(System.in);
int oro,plata,bronce;
boolean g=false;
String nombre;
while(true){
while(true){
nombre=l.next();
if(nombre.equals("@")){
break;
}
if(nombre.equals("#")){
g=true;
break;
}
oro=l.nextInt();
plata=l.nextInt();
bronce=l.nextInt();
list.add(new Medalla(nombre,oro,plata,bronce));
}
Comparator<Medalla>comparador=new Comparator<Medalla>(){
public int compare(Medalla a,Medalla b){
int resultado=Integer.compare(a.oro(),b.oro());
if(resultado!=0){
return resultado;
}
resultado=Integer.compare(a.plata(),b.plata());
if(resultado!=0){
return resultado;
}
resultado=Integer.compare(a.bronce(),b.bronce());
if(resultado!=0){
return resultado;
}

resultado=b.nombre().compareTo(a.nombre());
return resultado;

}

};
Collections.sort(list,comparador);
for(int u=list.size()-1;u>=0;u--){
System.out.println(list.get(u));
}
if(g){
break;

}
System.out.println("@");
list.clear();
}

}
}

class Medalla{
int oro,plata,bronce;
String nombre;
public Medalla(String nombre,int oro,int plata,int bronce){
this.nombre=nombre;
this.oro=oro;
this.plata=plata;
this.bronce=bronce;
}
public String toString(){
return nombre;

}
public int oro(){
return oro;
}
public int plata(){
return plata;
}
public int bronce(){
return bronce;
}
public String nombre(){
return nombre;
}

}


