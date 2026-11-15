
using System;

class Program
{
    static void Main(string[] args)
    {
        int a = 10, b = 5;

        // 1. Arithmetic Operators
        Console.WriteLine("--- Arithmetic Operators ---");
        Console.WriteLine("Addition: " + (a + b));
        Console.WriteLine("Subtraction: " + (a - b));
        Console.WriteLine("Multiplication: " + (a * b));
        Console.WriteLine("Division: " + (a / b));
        Console.WriteLine("Modulus: " + (a % b));

        // 2. Increment and Decrement Operators
        Console.WriteLine("\n--- Increment and Decrement ---");

        int x = 5;

        Console.WriteLine("Pre-Increment: " + (++x));
        Console.WriteLine("Post-Increment: " + (x++));
        Console.WriteLine("Value after Post-Increment: " + x);

        Console.WriteLine("Pre-Decrement: " + (--x));
        Console.WriteLine("Post-Decrement: " + (x--));
        Console.WriteLine("Value after Post-Decrement: " + x);

        // 3. Assignment Operators
        Console.WriteLine("\n--- Assignment Operators ---");

        int c = 10;

        c += 5;
        Console.WriteLine("Addition Assignment: " + c);

        c -= 3;
        Console.WriteLine("Subtraction Assignment: " + c);

        c *= 2;
        Console.WriteLine("Multiplication Assignment: " + c);

        c /= 4;
        Console.WriteLine("Division Assignment: " + c);

        c %= 3;
        Console.WriteLine("Modulus Assignment: " + c);

        // 4. Logical Operators
        Console.WriteLine("\n--- Logical Operators ---");

        bool p = true, q = false;

        Console.WriteLine("Logical AND: " + (p && q));
        Console.WriteLine("Logical OR: " + (p || q));
        Console.WriteLine("Logical NOT: " + (!p));

        // 5. Basic Bitwise Operators
        Console.WriteLine("\n--- Bitwise Operators ---");

        int m = 5, n = 3;

        Console.WriteLine("Bitwise AND: " + (m & n));
        Console.WriteLine("Bitwise OR: " + (m | n));
        Console.WriteLine("Bitwise XOR: " + (m ^ n));
        Console.WriteLine("Bitwise NOT: " + (~m));

        // 6. Relational Operators
        Console.WriteLine("\n--- Relational Operators ---");

        Console.WriteLine("Equal to: " + (a == b));
        Console.WriteLine("Not Equal to: " + (a != b));
        Console.WriteLine("Greater than: " + (a > b));
        Console.WriteLine("Less than: " + (a < b));
        Console.WriteLine("Greater than or Equal: " + (a >= b));
        Console.WriteLine("Less than or Equal: " + (a <= b));

        // 7. Ternary Operator
        Console.WriteLine("\n--- Ternary Operator ---");

        int max = (a > b) ? a : b;

        Console.WriteLine("Greater number is: " + max);
    }
}
