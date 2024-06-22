using System;

namespace Main
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			int a = 0, b = 0;
			string line;
			line = Console.ReadLine ();
			a = Int32.Parse (line.Split(' ')[0]);
			b = Int32.Parse (line.Split(' ')[1]);
			int z = a + b;
			Console.WriteLine (z);
			Console.ReadKey ();
		}
	}
}
