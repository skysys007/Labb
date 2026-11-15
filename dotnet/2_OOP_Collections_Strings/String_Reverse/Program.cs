using System;

class Program
{
    static void Main(string[] args)
    {
        string original  = "Racecar";
        // convert to char array
        char[] charArray = original.ToCharArray();
        // reverse the char array 
        Array.Reverse(charArray);
        // create a new string from the character array
        string reversed = new string(charArray);

        Console.WriteLine(reversed);
    }
}