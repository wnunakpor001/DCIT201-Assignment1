public class MobileMoneyPayment extends Payment{

    @Override
    public void processPayment(double amount) {
        System.out.println("Mobile Money Payment Processing of : $"  +  amount);

    }
}
