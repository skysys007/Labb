using System.Collections.Concurrent;

class Animal
{
    public virtual void MakeSound()
    {
        Console.WriteLine("I am an Animal and i make a sound");
    }
}
class Dog:Animal
{
    public override void MakeSound()
    {
        Console.WriteLine("I am a Dog and i Bark");
    }
}
class Calculator
{
    public virtual void Calculate(int a, int b)
    {
        Console.WriteLine($"Addition: {a+b}");
    }
}

class MultiCalc : Calculator
{
    public override void Calculate(int a, int b)
    {
        base.Calculate(a, b);
        Console.WriteLine($"Subtraction: {a-b}");
        Console.WriteLine($"Multiplication: {a*b}");
        Console.WriteLine($"Division: {a/b}");
    }
}

class Program
{
    public static void Main()
    {
        Animal a1 = new Animal();
        a1.MakeSound();
        Dog d1 = new Dog();
        d1.MakeSound();
        MultiCalc c1 = new MultiCalc();
        c1.Calculate(3, 4);

    }
}