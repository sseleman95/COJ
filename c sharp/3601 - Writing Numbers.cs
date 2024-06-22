using System;

namespace Main
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			string[] nums = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve"};

			int t = Int32.Parse (Console.ReadLine());
			int k = 0;

			for(int i = 0; i < t; i++){
				k = Int32.Parse (Console.ReadLine());
				Console.WriteLine (nums[k - 1]);
			}
		}
	}
}
