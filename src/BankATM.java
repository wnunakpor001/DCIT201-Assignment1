public class BankATM implements ATMOperations{

    private double balance;

    public BankATM(double balance) {
        this.balance = balance;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount. ");
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        }else {
            balance -= amount;
            System.out.println("Withdrawn Successfully: $" + amount);
        }
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount. ");
        }else  {
            balance += amount;
            System.out.println("Deposited Successfully: $" + amount);
        }

    }

    @Override
    public void checkBalance() {
        System.out.println("Current Balance is $" + balance);

    }
}
