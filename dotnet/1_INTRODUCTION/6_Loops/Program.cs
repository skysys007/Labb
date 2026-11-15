using System;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Numbers divisible by 3 from 1 to 50: ");
        for (int i = 0; i <= 50; i++)
        {
            if (i%3 == 0)
            {
                Console.WriteLine(i);
            }
        }
    }
}