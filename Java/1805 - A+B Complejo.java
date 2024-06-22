import java.math.*;
import java.util.*;

public class coj {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger(); BigInteger b = sc.nextBigInteger();
						
		System.out.println(a.add(b).add(a.subtract(b)).add(b.add(a)).add(b.subtract(a)));
	}

}
