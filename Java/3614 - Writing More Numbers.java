import java.util.*;

public class COJ1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] words=new String[] {"zero","one", "two", "three", "four", "five",
				"six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirt",
				"", ""};
		String[] words2=new String[] {"twen", "thir", "for", "fif", "six", "seven",
				"eight", "nine"};		
		String ten="teen";
		String ty="ty";		
		int k= sc.nextInt();
		for (int i = 0; i < k; i++) {
			int ki=sc.nextInt();
			if (ki<13) {
				System.out.println(words[ki]);
			} else {
				String num=String.valueOf(ki);
				int n1=Integer.parseInt(String.valueOf(num.charAt(0)));
				int n2=Integer.parseInt(String.valueOf(num.charAt(1)));
				if (ki<20) {
					switch (n2) {
					case 4:
						System.out.println(words[n2]+ten);
						break;
					case 8:
						System.out.println(words[n2].replaceFirst("t", "")+ten);
						break;

					default:
						System.out.println(words2[n2-2]+ten);
						break;
					}					
				} else {
					String temp=words2[n1-2]+ty;
					if (n1==8) {
						temp=temp.replaceFirst("t", "");
					}
					if (n2!=0) {
						temp+="-"+words[n2];
					}
					System.out.println(temp);
				}
			}			
		}
	}
}
