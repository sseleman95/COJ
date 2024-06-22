
import java.util.LinkedList;
import java.util.Scanner;


public class JavaApplication14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList <Integer> n = new LinkedList <Integer>();  
               
        for (int i = 0; i <= 2; i++) {
            int a = sc.nextInt();
            n.add(a);
        }
        String abc = sc.next();
        
        switch (abc) {
            case "ABC": {
                System.out.println(n.get(0)+" "+n.get(1)+" "+n.get(2));
                break;
            }
            case "BCA": {
                System.out.println(n.get(1)+" "+n.get(2)+" "+n.get(0));
                break;
            }
            case "CAB": {
                System.out.println(n.get(2)+" "+n.get(0)+" "+n.get(1));
                break;
            }
            case "ACB": {
                System.out.println(n.get(0)+" "+n.get(2)+" "+n.get(1));
                break;
            }
            case "CBA": {
                System.out.println(n.get(2)+" "+n.get(1)+" "+n.get(0));
                break;
            }
            case "BAC": {
                System.out.println(n.get(1)+" "+n.get(0)+" "+n.get(2));
                break;
            }
            case "abc": {
                System.out.println(n.get(0)+" "+n.get(1)+" "+n.get(2));
                break;
            }
            case "bca": {
                System.out.println(n.get(1)+" "+n.get(2)+" "+n.get(0));
                break;
            }
            case "cab": {
                System.out.println(n.get(2)+" "+n.get(0)+" "+n.get(1));
                break;
            }
            case "acb": {
                System.out.println(n.get(0)+" "+n.get(2)+" "+n.get(1));
                break;
            }
            case "cba": {
                System.out.println(n.get(2)+" "+n.get(1)+" "+n.get(0));
                break;
            }
            case "bac": {
                System.out.println(n.get(1)+" "+n.get(0)+" "+n.get(2));
                break;
            }
            default:{
                System.out.println("");
                break;
            }
                
        }
                
    }
}