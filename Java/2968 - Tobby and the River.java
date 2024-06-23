import java.util.ArrayList;
import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    Scanner l = new Scanner(System.in);
    int a = l.nextInt();
    int i;
    while (a != 0) {
      int b = 0;
      for (i = 0; i < 6; i++) {
        b += l.nextInt();
      }
      if (b % 2 == 0) {
        System.out.println("