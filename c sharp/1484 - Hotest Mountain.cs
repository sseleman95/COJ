using System;

namespace Application
{
	class MainClass
	{
		
		public static void Main (string[] args)
		{
			double mount = 0, max = 0;
			int pos = 0;
			int n = Int32.Parse(Console.ReadLine());

			for(int i = 1; i <= n; i++){
					mount = Double.Parse(Console.ReadLine());
					if(mount >= max){
						max = mount;
						pos = i;
					}
			}
			Console.WriteLine(pos);
		}

	}

}
