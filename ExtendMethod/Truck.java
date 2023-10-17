class Truck extends Vehicle {
    private double payloadCapacity;

    public Truck(String brand, int year, double price, double payloadCapacity) {
        super(brand, year, price);
        this.payloadCapacity = payloadCapacity;
    }

    public void loadCargo() {
        System.out.println("Loading cargo on the truck with " + payloadCapacity + " of capacity.");
    }
}
