using System;

class Program
{
    static void Main(string[] args)
    {
        string myText = null;
        try
        {
            Console.WriteLine("Trying to get length of text");
            int len = myText.Length;
            Console.WriteLine(len);
        }
        catch (NullReferenceException exc)
        {
            Console.WriteLine($"Error: {exc.Message}");
        }
    }
}