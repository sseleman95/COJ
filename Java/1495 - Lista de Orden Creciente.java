import java.util.*;

public class coj {

	public static void main(String[] args) {

		   Scanner sc =new Scanner(System.in);
		   int N=sc.nextInt();
		   int[]Ni = new int[N];
		   
		        for (int i = 0; i < N; i++) {
		            Ni[i]=sc.nextInt();
		        }
		        for (int x = 0; x < Ni.length; x++) {
		            for (int j = 0; j < Ni.length-x-1; j++) {
		                if(Ni[j] > Ni[j+1]){
		                    int tmp = Ni[j+1];
		                    Ni[j+1] = Ni[j];
		                    Ni[j] = tmp;
		                }
		            }
		        }
		        for (int k = 0; k < Ni.length; k++) {
					System.out.println(Ni[k]);
				}
	}

}