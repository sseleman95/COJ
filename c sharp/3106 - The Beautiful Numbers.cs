using System;

namespace Main
{
	class MainClass
	{
		public static string Reverse(string s)
		{
			char[] arr = s.ToCharArray();
			Array.Reverse(arr);
			return new string(arr);
		}

		public static void Main (string[] args)
		{
			string line;
			line = Console.ReadLine ();
	
			string a = line.Split(' ')[0];
			string b = line.Split(' ')[1];

			string c = a + "" + b;

			if (c == Reverse (c)) {
				Console.WriteLine ("Yes");
			} else {
				Console.WriteLine ("No");
			}

		}
	}
}
