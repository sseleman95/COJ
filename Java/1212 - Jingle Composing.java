import java.util.Scanner;

public class P1212 {

  private static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    String composition;
    String[] measures;
    int total;

    composition = sc.nextLine();

    while (!composition.equals("*")) {
      total = 0;
      measures = composition.substring(1, composition.length() - 1).split("/");

      for (String measure : measures) {
        float duration = 0;

        char[] notes = measure.toCharArray();

        for (char note : notes) {
          switch (note) {
            case 'W':
              duration += 1f;
              break;
            case 'H':
              duration += (float) 1 / (float) 2;
              break;
            case 'Q':
              duration += (float) 1 / (float) 4;
              break;
            case 'E':
              duration += (float) 1 / (float) 8;
              break;
            case 'S':
              duration += (float) 1 / (float) 16;
              break;
            case 'T':
              duration += (float) 1 / (float) 32;
              break;
            case 'X':
              duration += (float) 1 / (float) 64;
              break;
            default:
              break;
          }
        }

        if (duration == 1f) {
          total++;
        }
      }

      System.out.println(total);
      composition = sc.nextLine();
    }
  }
}
