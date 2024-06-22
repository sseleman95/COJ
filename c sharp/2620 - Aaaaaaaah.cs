using System;

namespace Main
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			int r = 0;
			r = Int32.Parse (Console.ReadLine());
			char a = 'a';
			Console.Write("A");
			for(int i = 1; i <= r  * 4; i++){
				Console.Write (a);
			}
			Console.Write ("h");
		}
	}
}
