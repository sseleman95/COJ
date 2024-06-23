import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;


public class SoftwareParaBusqueda {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Hashtable<String,Integer> dic=new Hashtable<>();
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            sc.next();
            String apellido = sc.next();
            if (dic.containsKey(apellido)) {
                int temp = dic.get(apellido);
                dic.put(apellido, temp + 1);
            } else {
                dic.put(apellido, 1);
            }
        }
        int a=sc.nextInt();
        for (int i = 0; i < a; i++) {
            sc.next();
            String apellido = sc.next();
            if (dic.containsKey(apellido)) {
                System.out.println(dic.get(apellido));
            } else {
                System.out.println(0);
            }
        }
    }
}
