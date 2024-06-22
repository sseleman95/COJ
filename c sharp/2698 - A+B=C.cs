using System;

namespace WayLong
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			string str = Console.ReadLine();
			int res = 0;

			for (int i = 0; i < str.Length; i++) {
				res += (str[i] - 'A' + 1);
			}

			Console.WriteLine (res);
		}
	}
}
