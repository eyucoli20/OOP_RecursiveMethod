public class Main {
    public static void main(String[] args) {

        Vehicle vic = new Vehicle("Honda", 2014, 15000 );
        Bicycle bike = new Bicycle("Mountain", 2012, 22000, 4);
        Car car = new Car("Buick", 2019, 38000, 6);
        Motorcycle moto = new Motorcycle("Amtrack", 2016, 19800, "Horse Power");
        Truck truck = new Truck("Bulldog", 2021, 42000, 12000);

        vic.start();
        bike.pedal();
        car.drive();
        moto.ride();
        truck.loadCargo();
    }
}


