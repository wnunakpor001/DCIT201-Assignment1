public class BankTransferPayment extends Payment{
    @Override
    public void processPayment(double amount) {
        System.out.println("Bank Transfer Payment Processing of: $"  +  amount);
    }
}
