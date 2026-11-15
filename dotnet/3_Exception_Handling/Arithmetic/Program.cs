using System;

class Program
{
    static void Main(string[] args)
    {
        int a = 10;
        try
        {
            int result = a/0; //Divide by zero exception
        }
        catch(DivideByZeroException exc)
        {
            Console.WriteLine($"Exception: {exc.Message}");
        }
        finally
        {
            Console.WriteLine("Finally runs");
        }
        
    }
}