import java.io.*;
import java.util.*;

public class WERTYU1665 {

  public static final char[] keyboardLine1 = {
    '`',
    '1',
    '2',
    '3',
    '4',
    '5',
    '6',
    '7',
    '8',
    '9',
    '0',
    '-',
    '=',
  };
  public static final char[] keyboardLine2 = {
    'Q',
    'W',
    'E',
    'R',
    'T',
    'Y',
    'U',
    'I',
    'O',
    'P',
    '[',
    ']',
    '\\',
  };
  public static final char[] keyboardLine3 = {
    'A',
    'S',
    'D',
    'F',
    'G',
    'H',
    'J',
    'K',
    'L',
    ';',
    '\'',
  };
  public static final char[] keyboardLine4 = {
    'Z',
    'X',
    'C',
    'V',
    'B',
    'N',
    'M',
    ',',
    '.',
    '/',
  };
  public static char[][] keyboard = {
    keyboardLine1,
    keyboardLine2,
    keyboardLine3,
    keyboardLine4,
  };
  public static HashMap<Character, QWERTY> map;

  public static class QWERTY {

    private final char[] keyboardLine;
    private final int position;

    public QWERTY(char[] keyboardLine, int position) {
      this.keyboardLine = keyboardLine;
      this.position = position;
    }

    public char getChar() {
      return keyboardLine[position - 1];
    }
  }

  private static void fillMap() {
    map = new HashMap<>();
    for (char[] keyboard1 : keyboard) {
      for (int j = 0; j < keyboard1.length; j++) {
        map.put(keyboard1[j], new QWERTY(keyboard1, j));
      }
    }
  }

  public static void main(String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    OutputStreamWriter osw = new OutputStreamWriter(System.out);
    try (BufferedWriter bw = new BufferedWriter(osw)) {
      fillMap();
      while (br.ready()) {
        String line = br.readLine();
        for (int i = 0; i < line.length(); i++) {
          switch (line.charAt(i)) {
            case ' ':
              bw.append(" ");
              break;
            default:
              bw.append(map.get(line.charAt(i)).getChar());
              break;
          }
        }
        bw.newLine();
      }
      bw.flush();
    }
  }
}
