using System;

namespace Main
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			string line;
			line = Console.ReadLine ();

			long a   = long.Parse   (line.Split(' ')[0]);
			long b   = long.Parse   (line.Split(' ')[1]);

			Console.WriteLine (a * b);
		}
	}
}
