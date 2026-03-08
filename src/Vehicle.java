public class Vehicle {
    protected String brand;


    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void startEngine() {
        System.out.println("Starting Vehicle Engine: " + brand);
    }
}
