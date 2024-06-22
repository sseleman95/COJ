using System;

namespace Main
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			int a = 0, b = 0, c = 0;
			string space = "";

			space = Console.ReadLine ();

			while(space != "0"){
        
			a = Int32.Parse (space.Split(' ')[0]);
			b = Int32.Parse (space.Split(' ')[1]);
			c = Int32.Parse (space.Split(' ')[2]);
				
			if (b > c && b > a)
			{
				int k = b;
				b = c;
				c = k;
			}
			else if (a > c && a > b)
			{
				int h = a;
				a = c;
				c = h;
			}

			if ((a * a) + (b * b) == (c * c)) {
				Console.WriteLine ("right");
			} 
			else{
				Console.WriteLine ("wrong");
			}
				space = Console.ReadLine ();
		  }
		}
	}
}
