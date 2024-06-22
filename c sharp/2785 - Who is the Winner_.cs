using System;

namespace Main
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			int c = Int32.Parse (Console.ReadLine ());
			float sum = 0;
			for(int i = 0; i < c; i++){
				int n = Int32.Parse (Console.ReadLine ());
				sum += n;
			}
			double total = sum / c;
			string s = total.ToString("N2");
			Console.WriteLine (s);

		}
	}
}