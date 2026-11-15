using System;

class Animal
{
    public Animal()
    {
        Console.WriteLine("I am an Animal");
    }
}

// SINGLE Inheritance
class Dog : Animal
{
    public Dog()
    {
        Console.WriteLine("I am a Dog");
    }
}

// MULTILEVEL Inheritance and Hierarchical Inheritance
class Dalmatian: Dog
{
    public Dalmatian()
    {
        Console.WriteLine("I am a Dalmatian");
    }
}
// MULTILEVEL Inheritance and Hierarchical Inheritance
class Pomerian: Dog
{
    public Pomerian()
    {
        Console.WriteLine("I am a Pomerian");
    }
}

interface LandVehicle
{
    void LandInfo();
}
interface WaterVehicle
{
    void WaterInfo();
}

class AmphibiousVehicle: LandVehicle, WaterVehicle
{
    public AmphibiousVehicle()
    {
        Console.WriteLine("Amphibious Vehicle");
    }
    public void LandInfo()
    {
        Console.WriteLine("I can run on Land");
    }
    public void WaterInfo()
    {
        Console.WriteLine("I can run on Water");
    }
}

class Program
{
    static void Main(string[] args)
    {
        // SINGLE Inheritance
        Dog d1 = new Dog();
        Console.WriteLine();
        Dalmatian da1 = new Dalmatian();
        Console.WriteLine();
        Pomerian p1 = new Pomerian();
        Console.WriteLine();

        AmphibiousVehicle v1 = new AmphibiousVehicle();
        v1.LandInfo();
        v1.WaterInfo();
    }
}