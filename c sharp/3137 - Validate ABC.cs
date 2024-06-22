using System;

namespace Main
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			int n = 0, a = 0, b = 0, c = 0;
			n = Int32.Parse (Console.ReadLine ());

			for (int i = 0; i < n; i++) {
				string line;
				line = Console.ReadLine ();
				a = Int32.Parse (line.Split (' ') [0]);
				b = Int32.Parse (line.Split (' ') [1]);
				c = Int32.Parse (line.Split (' ') [2]);
		
				if ((a + b == c) || (a - b == c) || (a * b == c) || (b != 0 && ((a / b == c) || (a % b == c)))) {
						Console.WriteLine ("YES");
					} else {
						Console.WriteLine ("NO");
					}
			}
		}
	}
}
