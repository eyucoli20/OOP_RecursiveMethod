class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int year, double price, int numberOfDoors) {
        super(brand, year, price);
        this.numberOfDoors = numberOfDoors;
    }

    public void drive() {
        System.out.println("Driving the car with " + numberOfDoors + " Door");
    }
}
