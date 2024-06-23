import java.util.Scanner;
import java.util.StringTokenizer;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
char [][] matriz = {{'1','2','3','4','5','6','7','8','9','0','-','='},
                    {'Q','W','E','R','T','Y','U','I','O','P','[',']'},
					{'A','S','D','F','G','H','J','K','L',';','(',')'},
                    {'Z','X','C','V','B','N','M',',','.','/','!','@'}};
					String y="";
					String s=l.nextLine();
					for(int w=0;w<s.length();w++){
					for(int i=0;i<matriz.length;i++){
						for(int j=0;j<matriz[0].length;j++){
							
							if(matriz[i][j]==s.charAt(w)){
								y+=matriz[i][j-1];
							}
							
						
						}
					}
					if(s.charAt(w)==' '){
								y+=" ";
								
							}
					}
					System.out.println(y);
}
}