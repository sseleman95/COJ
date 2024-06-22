using System;

namespace LazySum
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			int c = Int32.Parse(Console.ReadLine());

			for(int i = 0; i < c; i++){
				string num =  Console.ReadLine();
				int sum = 0;

				for(int j = 0; j < num.Length;j++)
					sum += num[j]- '0';

				while (sum >= 10) {
					int res = 0;
					int a = sum;
					while (a > 0) {
						res += a % 10;
						a /= 10;
					}
					sum = res;
				}
				Console.WriteLine (sum);
			}
		}
	}
}