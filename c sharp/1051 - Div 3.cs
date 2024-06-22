using System;

namespace Application
{
    class MainClass
    {
        public static void Main (string[] args)
        {
            int n = 0, r = 0;

            n = Int32.Parse(Console.ReadLine());

            if (n % 3 == 0) {
                r = n - (n / 3);
            } 
            else if (n % 3 == 1) {
                r = (n - 1) - ((n - 1) / 3);
            } 
            else {
                r = (n - ((n + 1) / 3));
            }

            Console.WriteLine (r);


        }
    }
}