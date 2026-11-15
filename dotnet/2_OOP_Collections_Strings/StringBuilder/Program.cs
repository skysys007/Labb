using System;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        StringBuilder s1 = new StringBuilder("Hello World");
        Console.WriteLine($"Original:{s1}");
        Console.WriteLine($"Appended:{s1.Append(", such a nice day")}");
        Console.WriteLine($"Removed: {s1.Remove(5, 6)}");
        Console.WriteLine($"Inserted: {s1.Insert(5, "!")}");

    }
}