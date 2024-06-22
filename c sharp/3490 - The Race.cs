using System;

namespace Main
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			int N = Int32.Parse (Console.ReadLine ());

			for(int i = 0; i < N; i++){
				string line;
				line = Console.ReadLine ();
				int M = Int32.Parse(line.Split(' ')[0]);
				int D = Int32.Parse(line.Split(' ')[1]);
				Console.WriteLine (D - (D / M));
			}
		}
	}
}
