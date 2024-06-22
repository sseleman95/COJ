using System;

namespace Main
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			int c = int.Parse (Console.ReadLine());

			for (int j = 0; j < c; j++) {
				int n = Int32.Parse (Console.ReadLine ());
				int sum = 0;
				for (int i = 1; i < n; i++) {
					if (n % i == 0) {
						sum += i;
					}
				}
				if (sum < n) {
					Console.WriteLine ("Deficient");
				} 
				else if(sum == n){
					Console.WriteLine ("Perfect");
				}
				else{
					Console.WriteLine ("Abundant");
				}
			}


		}
	}
}