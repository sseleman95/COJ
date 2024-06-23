import java.util.Scanner;

public class DisplacingCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String cadena = sc.next();
            int cant = sc.nextInt();
            for (int j = 0; j <cant; j++) {
                String letra=cadena.substring(cadena.length()-1,cadena.length());
                String resto=cadena.substring(0,cadena.length()-1);
                cadena=letra+resto;
            }
            System.out.println(cadena);
        }
    }
}
