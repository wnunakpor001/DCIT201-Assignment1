public class FullTimeEmployee extends Employee {

    private double bonus;

    public FullTimeEmployee(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public double calculateAnnualSalary() {
        return ((salary * 12) + bonus);
    }
}


