import java.util.*;

public class COJ2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] array = new String[20];
    for (int i = 0; i < array.length; i++) {
      String temp = sc.nextLine();
      if (temp.equals("")) {
        array[i] = null;
      } else {
        array[i] = temp;
      }
    }

    for (int i = 0; i < array.length; i++) {
      if (array[i] != null) {
        StringTokenizer st = new StringTokenizer(array[i], " ");
        String temp_1 = st.nextToken();
        String temp_2 = st.nextToken();

        int k = 0, j = 0;
        boolean control = false;
        while (j < temp_2.length()) {
          if (temp_2.charAt(j) == temp_1.charAt(k)) {
            k++;
          }
          if (k == temp_1.length()) {
            control = true;
            break;
          }
          j++;
        }
        if (control) {
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }
      }
    }
  }
}
