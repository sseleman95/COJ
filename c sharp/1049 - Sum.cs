using System;

namespace Main
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			int n = 0, sum = 0;
			n = Convert.ToInt32(Console.ReadLine());
			if (n > 0) {
				for (int i = 1; i <= n; i++) {
					sum += i;
				}
			}
			else if (n < 0) {
				for (int j = 1; j >= n; j--) {
					sum += j;
				}
			}
			Console.WriteLine (sum);
		}
	}
}