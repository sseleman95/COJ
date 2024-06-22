using System;

namespace Main
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			double balance = 0, sum = 0;

			for(int i = 0; i < 12; i++){
				balance = Double.Parse (Console.ReadLine());
				sum += balance;
			}
			Console.WriteLine ("$" + sum / 12);
		}
	}
}
