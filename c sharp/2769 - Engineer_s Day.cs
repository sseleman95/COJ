using System;

namespace Main
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			int n = Int32.Parse (Console.ReadLine ());
			for (int i = 1; i <= n; i++) {
				Console.WriteLine (i + ": I am participating in the Engineer's day." );			
			}

		}
	}
}