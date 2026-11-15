using System;

class Program
{
    static void Main(string[] args)
    {
        string str1 = "Hello";
        string str2 = "World";
        // String Conversion
        String str3 = str1.ToUpper();
        Console.WriteLine(str3);
        String str4 = str2.ToLower();
        Console.WriteLine(str4);
        
        if(str1 == str3)
        {
            Console.WriteLine("Both String are equal");
        }
        str1 = str1.ToUpper();
        if (str1.Equals(str3))
        {
            Console.WriteLine("Both Strings are equal");
        }

        int result = String.Compare(str1, str2);
        // .Compare compares a string Lexicographically        
    }
}