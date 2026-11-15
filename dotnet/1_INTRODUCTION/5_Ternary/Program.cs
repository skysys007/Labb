using System;

class Program
{
    static void Main(string[] args)
    {
        int num = 9;
        Console.WriteLine(
        (num>10)?"Greater than 10":
        (num==10)?"Equals 10":
        "Less than 10");
        
    }
}