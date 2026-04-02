class Main {    
    static void withdraw(int balance, int amount) {
        if (amount > balance) {
            throw new ArithmeticException("Insufficient balance!");
        } else {
            balance = balance - amount;
            System.out.println("Remaining balance: " + balance);
        }
    }

    public static void main(String[] args) {
        int balance = 5000;
        int amount = 7000;

        try {
            withdraw(balance, amount);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Transaction completed");
        }

    }
}