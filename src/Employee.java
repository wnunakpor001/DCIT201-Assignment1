public class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
   public Employee(String name) {
        this.name = name;
   }

    public double calculateAnnualSalary() {
        return (salary * 12);
    }
}
