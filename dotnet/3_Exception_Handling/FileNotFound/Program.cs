using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        string path = "C:/Users/MyFolder/anyfile.txt";
        try
        {
            string content = File.ReadAllText(path);
        }
        catch (FileNotFoundException exc)
        {
            Console.WriteLine($"Error: {exc.Message}");
        }
    }
}