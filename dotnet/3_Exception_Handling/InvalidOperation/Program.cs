using System;
using System.Collections.Generic;

class Program
{
    static void Main(string[] args)
    {
        List<string> tasks = new List<string>{"Deploy", "Code", "Test", "Design"};
        try
        {
            foreach (var task in tasks)
            {
                // a collection cannot be changed while iterating over it
                if (task == "Test")
                {
                    tasks.Remove(task);
                }
            }
        }
        catch (InvalidOperationException exc)
        {
            Console.WriteLine("Error: " + exc.Message);
        }
    }
}