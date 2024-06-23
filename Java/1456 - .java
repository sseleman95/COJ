import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Hashtable;

public class HelpRequired {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception{
		int n, num, key;
		
		Hashtable<Integer,Integer> hashTable = new Hashtable<Integer,Integer>();
		n = Integer.parseInt(in.readLine()); 
		for(int i = 0; i < n; i++){		
			num = Integer.parseInt(in.readLine());
			if (hashTable.containsKey(num))
				hashTable.put(num, hashTable.get(num)+1);
			else
				hashTable.put(num, 1);
		}
		
		Enumeration<Integer> keys = hashTable.keys();
		while (keys.hasMoreElements()){
			key = keys.nextElement();
			if (hashTable.get(key) == 1){
				System.out.println(key);
				break;
			}
		}
	}
}
