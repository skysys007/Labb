class BankAccount {

    private int accountNumber;
    private final String customerName;  
    private String phoneNumber;
    private String password;             
    private double balance;

    public BankAccount(int accountNumber, String customerName,
                       String phoneNumber, String password, double balance) {
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
    }

    // Change Password (no getter for password)
    public void changePassword(String newPassword) {
        this.password = newPassword;
    }

    // Getters & Setters (except name & password getter)
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


// Child Class - Saving Account
class SavingAccount extends BankAccount {

    private double interestRate;
    private double minBalance;
    private int withdrawLimit;

    public SavingAccount(int accountNumber, String customerName,
                         String phoneNumber, String password, double balance,
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


// Child Class - Business Account
class BusinessAccount extends BankAccount {

    private String companyName;
    private double transactionFeeRate;
    private double transactionAmount;

    public BusinessAccount(int accountNumber, String customerName,
                           String phoneNumber, String password, double balance,
                           String companyName, double transactionFeeRate,
                           double transactionAmount) {

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
