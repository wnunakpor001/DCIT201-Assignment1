public class Motorcycle extends Vehicle{
    public Motorcycle(String brand) {
        super(brand);
    }

    @Override
    public void startEngine() {
        System.out.println("Starting Motorcycle Engine: " + brand);
    }
}
