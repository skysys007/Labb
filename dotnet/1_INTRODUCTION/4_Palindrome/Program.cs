using System;

class Program
{
    static void Main(string[] args)
    {
        int org = 111;
        int num = org;
        int rem, sum = 0;
        while (num>0)
        {
            rem = num%10;
            sum = sum*10 + rem;
            num/=10;
        }

        if (org == sum)
        {
            Console.WriteLine("Number is Palindrome");
        }
        else
        {
            Console.WriteLine("Number is not a Palindrome");
        }

    }
}