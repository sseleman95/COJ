import java.util.Scanner;

public class P1506 {

  private static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    byte numQuestions = sc.nextByte();
    String answersLine = sc.next();
    char[] correctAnswers = answersLine.toCharArray();

    short m = sc.nextShort();

    for (short i = 0; i < m; i++) {
      float score = 0;

      answersLine = sc.next();
      char[] alumnsAnswers = answersLine.toCharArray();

      for (int j = 0; j < alumnsAnswers.length; j++) {
        if (alumnsAnswers[j] != '#') {
          if (alumnsAnswers[j] == correctAnswers[j]) {
            score++;
          } else {
            score -= 0.25f;
          }
        }
      }

      System.out.format("%.2f\n", score);
    }
  }
}
