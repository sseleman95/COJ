using System;

namespace Main
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			long A = 0, B = 0;
			string line;
			line = Console.ReadLine ();
			A = long.Parse (line.Split(' ')[0]);
			B = long.Parse (line.Split(' ')[1]);
			long R = (A + B) + (A - B) + (B + A) + (B - A);
			Console.WriteLine (R);
		}
	}
}
