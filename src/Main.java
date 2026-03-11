import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Testing for BankAccount.java

        BankAccount account = new BankAccount("0005245", "Wisdom Nunakpor", 505);

        account.deposit(10);
        account.deposit(-50);
        account.withdraw(510);
        System.out.println(account.getBalance());
        System.out.println(account.getAccountNumber());


        // Testing for Student.java

       Student s1 = new Student("22308278", "Wisdom Nunakpor", 90);


        System.out.println("Student ID: " + s1.getStudentID());
        System.out.println("Name: " + s1.getName());
        System.out.println("Score: " + s1.getScore());
        System.out.println("Grade: " + s1.getGrade());



        // Testing for Employee.java, FullTimeEmployee.java and PartTimeEmployee.java

        FullTimeEmployee emp1 = new FullTimeEmployee("Senyo", 2558, 520);
        PartTimeEmployee emp2 = new PartTimeEmployee("Wisdom", 8, 520);

        System.out.println("Full Time Employee Annual Salary: $"  +  emp1.calculateAnnualSalary());
        System.out.println("Part Time Employee Annual Salary: $"  +  emp2.calculateAnnualSalary());



//     Testing Vehicle.java, Car.java and Motorcycle.java

        Car car = new Car("Honda");
        Motorcycle m1 = new Motorcycle("Haujie");
        Vehicle v1 = new Vehicle("Tesla");

        car.startEngine();
        m1.startEngine();
        v1.startEngine();

//        Testing for Payment.java

        List<Payment> payments = new ArrayList<>();

        payments.add(new CreditCardPayment());
        payments.add(new MobileMoneyPayment());
        payments.add(new BankTransferPayment());

        for (Payment payment : payments) {
            payment.processPayment(1200);
        }

        //      Testing for ATMOperations.java and  BankATM.java

        BankATM bankATM = new BankATM(500);

        bankATM.deposit(1000);
        bankATM.withdraw(500);
        bankATM.checkBalance();
    }
}
