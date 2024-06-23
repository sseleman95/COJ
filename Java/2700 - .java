import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class UniqwordsComparison {

    static Scanner in = new Scanner(System.in);
    static HashMap<Character, Integer> ocurrences = new HashMap<>();
    static String s1 = "First:";
    static String s2 = "Second:";
    static String s3 = "First&Second:";

    public static void main(String[] args) {

        char[] charArray1 = in.nextLine().toCharArray();
        for (char c : charArray1) {
            getAndPut(c);
        }

        char[] charArray2 = in.nextLine().toCharArray();
        for (char c : charArray2) {
            Integer cOcurrences = getAndPut(c);
            if (cOcurrences == 2) {
                s3 += c;
            } else {
                s2 += c;
            }
        }

        for (char c : charArray1) {
            if (ocurrences.get(c) == 1) {
                s1 += c;
            }
        }

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

    public static Integer getAndPut(char c) {
        Integer cOcurrences = ocurrences.get(c);

        if (cOcurrences == null) {
            ocurrences.put(c, 1);
            cOcurrences = 0;
        } else {
            ocurrences.put(c, cOcurrences + 1);
        }
        cOcurrences++;
        return cOcurrences;
    }

    public static void printHashMap() {
        System.out.println("HashMap: ");
        for (Character c : ocurrences.keySet()) {
            System.out.println(c + ": " + ocurrences.get(c));
        }
    }
}
