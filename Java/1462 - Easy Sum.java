import java.util.Scanner;

class Main {

  static Scanner in = null;

  public static void main(String args[]) {
    in = new Scanner(System.in);
    int n = in.nextInt();
    long sum = 0;
    for (int i = 0; i < n; i++) {
      sum += (in.nextInt());
    }
    System.out.println((sum & 127));
  }
}
