using System;
class Program
{
    static void Main(string[] args)
    {
        int org = 123;
        int num = org;  
        int rem;
        int sum = 0;
        int count = 0;
        while (num>0)
        {
            count++;
            num/=10;
        }
        num = org;

        while (num>0)
        {
            rem = num%10;
            sum += (int)Math.Pow(rem, count);
            num/=10;
        }
        if (org == sum)
        {
            Console.WriteLine("Number is Armstrong");
        }
        else
        {
            Console.WriteLine("Number is not an Armstrong");
        }
    }
}