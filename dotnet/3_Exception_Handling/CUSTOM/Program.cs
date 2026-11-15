using System;

class BankAccount
{
    public double balance;
    public double limit = 70000;

    public BankAccount(double amt)
    {
        balance = amt;
    }

    public void Withdraw(double amount)
    {
        if (balance<amount)
        {
            throw new InsufficientFundsException(
                "Insufficient Funds!"
            );
        }
        if (amount>limit)
        {
            throw new DailyLimitExceededException(
                "Daily Limit Exceeded!"
            );
            
        }
        balance-=amount;
        limit-=amount;
        Console.WriteLine($"{amount}Successfully Withdrawn");
        Console.WriteLine($"Remaining Balance: {balance}");
    }
}

class InsufficientFundsException:Exception
{
    // constructor with a string message
    public InsufficientFundsException(string message):base(message){}
}

class DailyLimitExceededException:Exception
{
    public DailyLimitExceededException(string message):base(message){}
}
class Program
{
    static void Main(string[] args)
    {
        BankAccount b1 = new BankAccount(90000);

        // Scenario 1: Successfull
        try
        {
            b1.Withdraw(40000);
        }
        catch (InsufficientFundsException exc)
        {
            Console.WriteLine(exc.Message);
        }
        catch (DailyLimitExceededException exc)
        {
            Console.WriteLine(exc.Message);
        }

        // Scenario 2: Insuff
        try
        {
            b1.Withdraw(60000);
        }
        catch (InsufficientFundsException exc)
        {
            Console.WriteLine(exc.Message);
        }
        catch (DailyLimitExceededException exc)
        {
            Console.WriteLine(exc.Message);
        }

        // Scenario 3: DailyLimitExceeded
        try
        {
            b1.Withdraw(40000);
        }
        catch (InsufficientFundsException exc)
        {
            Console.WriteLine(exc.Message);
        }
        catch (DailyLimitExceededException exc)
        {
            Console.WriteLine(exc.Message);
        }

        
    }
}
