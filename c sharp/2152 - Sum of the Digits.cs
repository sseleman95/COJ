using System;

namespace Main
{
    class Program
    {
        static void Main(string[] args)
        {
            int cases = int.Parse(Console.ReadLine());
            string num, linea;
            int sum;
            for (int i = 0; i < cases; i++)
            {
                linea = Console.ReadLine();
                if (linea[0] == '-') num = linea.Substring(1);
                else num = linea;
                sum = 0;
                for (int j = 0; j < num.Length; j++)
                    sum += (num[j] - '0');
                Console.WriteLine(sum);
            }
        }
    }
}
