using System;
using System.Runtime.CompilerServices;

class Program
{
    static void Main(string[] args)
    {
        int[] arr = {1, 2, 4, 5, 7};
        try
        {
            Console.WriteLine(arr[7]);
        }
        catch (IndexOutOfRangeException exc)
        {
            Console.WriteLine($"Error: {exc.Message}");
        }
    }
}