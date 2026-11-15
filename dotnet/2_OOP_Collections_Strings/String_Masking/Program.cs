using System;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Enter a string to mask: ");
        string str = Console.ReadLine();

        Console.WriteLine("Enter starting position to mask");
        int start = Convert.ToInt32(Console.ReadLine());

        Console.WriteLine("Enter number of characters to mask");
        int count = Convert.ToInt32(Console.ReadLine());
        

        string cut = str.Remove(start-1, count);
        string mask = new string('*', count);

        string result = cut.Insert(start-1, mask);
        Console.WriteLine(result);
    }
}