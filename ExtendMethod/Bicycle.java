class Bicycle extends Vehicle {
    private int numberOfGears;

    public Bicycle(String brand, int year, double price, int numberOfGears) {
        super(brand, year, price);
        this.numberOfGears = numberOfGears;
    }

    public void pedal() {
        System.out.println("Pedaling the bicycle and enjoy with " + numberOfGears + "Gears");
    }
}