class BankAccount {
    public int accountNumber;
    public final String customerName;
    public String phoneNumber;
    private String password;
    public double balance;

    public BankAccount(int accountNumber, String customerName, String phoneNumber, String password, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw Successful");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void addAmount(double amount) {
        balance += amount;
        System.out.println("Amount Added");
    }

    public void changePassword(String newPassword) {
        this.password = newPassword;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingAccount extends BankAccount {
    private double interestRate;
    private double minBalance;
    private int withdrawLimit;

    public SavingAccount(int accountNumber, String customerName, String phoneNumber, String password, double balance,
                         double interestRate, double minBalance, int withdrawLimit) {
        super(accountNumber, customerName, phoneNumber, password, balance);
        this.interestRate = interestRate;
        this.minBalance = minBalance;
        this.withdrawLimit = withdrawLimit;
    }

    public void updateWithdrawLimit(int limit) {
        this.withdrawLimit = limit;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Min Balance: " + minBalance);
        System.out.println("Withdraw Limit: " + withdrawLimit);
    }
}

class BusinessAccount extends BankAccount {
    private String companyName;
    private double transactionFeeRate;
    private double transactionAmount;

    public BusinessAccount(int accountNumber, String customerName, String phoneNumber, String password, double balance,
                           String companyName, double transactionFeeRate, double transactionAmount) {
        super(accountNumber, customerName, phoneNumber, password, balance);
        this.companyName = companyName;
        this.transactionFeeRate = transactionFeeRate;
        this.transactionAmount = transactionAmount;
    }

    public void calculateTransactionFee() {
        double fee = transactionAmount * transactionFeeRate;
        System.out.println("Transaction Fee: " + fee);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Company Name: " + companyName);
        System.out.println("Transaction Fee Rate: " + transactionFeeRate);
        System.out.println("Transaction Amount: " + transactionAmount);
    }
}

public class Main {
    public static void main(String[] args) {

        SavingAccount sa = new SavingAccount(101, "gagan", "1234567890", "pass123", 5000,
                                             5.0, 1000, 3);
        sa.addAmount(2000);
        sa.withdraw(1000);
        sa.updateWithdrawLimit(5);
        sa.displayInfo();

        System.out.println();

        BusinessAccount ba = new BusinessAccount(201, "Anish", "0987654321", "bizpass", 10000,
                                                 "SMIT", 0.02, 5000);
        ba.withdraw(2000);
        ba.calculateTransactionFee();
        ba.displayInfo();
    }
}
