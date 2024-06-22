import java.util.*;
public class COJ2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(phei(n));
	}

	private static int phei(int n) {
		int result = n;
		
		for (int i = 2; i*i <= n; i++) {
			if (n%i==0) {
				while(n%i==0)
	            {
	                n=n/i;
	            }
	            result=result-(result/i);
			}
		}
		
		if(n>1)
	    {
	        result=result-(result/n);
	    }
		
		return result;
	}

}