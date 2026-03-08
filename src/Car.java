public class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    @Override
    public void startEngine() {
        System.out.println("Starting Vehicle (Car) Engine: " + brand);
    }

}
