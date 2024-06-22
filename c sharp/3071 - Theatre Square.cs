using System;

namespace Main
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			int n = 0, m = 0, a = 0;
			string line;
			line = Console.ReadLine ();
			n = Int32.Parse (line.Split(' ')[0]);
			m = Int32.Parse (line.Split(' ')[1]);
			a = Int32.Parse (line.Split(' ')[2]);

			long  row = (long) n / a;
			if(n % a != 0){
				row++;
			}
			long column = (long) m / a;
			if(m % a != 0){
				column++;
			}
			Console.WriteLine(row * column);

		}
	}
}
