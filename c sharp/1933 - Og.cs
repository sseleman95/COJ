using System;

namespace Main
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			int L = 0, R = 0;
			while(true) {
				string line;
				line = Console.ReadLine ();
				L = Int32.Parse (line.Split (' ') [0]);
				R = Int32.Parse (line.Split (' ') [1]);

				if(L == 0 && R == 0){
					break;
				}
				Console.WriteLine (L + R);
			}
		}
	}
}