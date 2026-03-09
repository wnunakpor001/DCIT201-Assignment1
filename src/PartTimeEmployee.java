public class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, double salary, int hoursWorked, double hourlyRate) {
        super(name,salary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    public PartTimeEmployee(String name,int hoursWorked, double hourlyRate) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }



    @Override
    public double calculateAnnualSalary() {
        return ( (salary * 12) + (hourlyRate * hoursWorked) );
    }
}
