class Motorcycle extends Vehicle {
    private String type;

    public Motorcycle(String brand, int year, double price, String type) {
        super(brand, year, price);
        this.type = type;
    }

    public void ride() {
        System.out.println("Riding the motorcycle with " + type + " styles");
    }
}
