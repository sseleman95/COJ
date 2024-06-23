import java.io.*;
import java.util.*;
        public class Ejercicio
{
    public static void main(String []args)throws IOException
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in),1024*8);
       String s="";
       while(true)
       {
       s=br.readLine();
       if(!s.equals("*"))
       {
       boolean aux=true; 
       StringTokenizer tk=new StringTokenizer (s);
       char aux2=tk.nextToken().toLowerCase().charAt(0);
       while(tk.hasMoreTokens())
       {
           if(tk.nextToken().toLowerCase().charAt(0)!=aux2)
           {
               aux=false;
               break;
           }
       }
       if(aux!=true)
       {
           System.out.println("N"); 
       }
       else
               System.out.println("Y");
          
       }
       else
           break;
       
       }   
        
    }
}
