using System;

class Program
{
    static void Main(string[] args)
    {
        string str = "csjdn9023";
        try
        {
            int result = int.Parse(str);
            Console.WriteLine($"Parsed Number:{result}");
        }
        catch (FormatException exc)
        {
            Console.WriteLine($"Error: {exc.Message}");
        }
    }
}