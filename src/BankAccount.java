public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Deposit method

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else {
            this.balance += amount;
            System.out.println("Deposit successful. New Balance: " + amount);
        }
    }

    // Withdrawal method

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else if (amount > this.balance)  {
            System.out.println("Insufficient balance");
        } else  {
            this.balance -= amount;
            System.out.println("Withdrawal successful. New Balance: " + amount);
        }
    }

    public double getBalance() {
        return balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
}
