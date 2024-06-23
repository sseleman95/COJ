import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Criptogony {

    static BufferedReader in = new BufferedReader(new InputStreamReader(
            System.in));

    public static void main(String[] args) throws Exception {
        int n;
        String readed, message;
        String[] alphabet;
        char character;

        n = Integer.parseInt(in.readLine());

        for (int i = 0; i < n; i++) {

            Map<Character, Integer> map = new HashMap<Character, Integer>();

            in.readLine();

            readed = in.readLine();
            alphabet = readed.split(" ");

            message = in.readLine();
            for (int j = 0; j < message.length(); j++) {
                character = message.charAt(j);
                if (map.containsKey(character)) {
                    map.put(character, map.get(character) + 1);
                } else {
                    map.put(character, 1);
                }
            }

            List<Map.Entry<Character, Integer>> list = new LinkedList<Map.Entry<Character, Integer>>(map.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
                public int compare(Map.Entry<Character, Integer> entry1, Map.Entry<Character, Integer> entry2) {
                    return entry1.getValue().compareTo(entry2.getValue());
                }
            });
            Collections.reverse(list);

            HashMap<Character, String> hashMap = new HashMap<Character, String>();
            int index = 0;
            for (Map.Entry<Character, Integer> entry : list) {
                hashMap.put(entry.getKey(), alphabet[index]);
                index++;
            }

            for (int j = 0; j < message.length(); j++) {
                System.out.print(hashMap.get(message.charAt(j)));
            }
            System.out.println();
        }
    }
}
