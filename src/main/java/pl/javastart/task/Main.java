package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Car[] vehicles = new Car[4];
        vehicles[0] = new Car("Maluch", 20, 16.5, false);
        vehicles[1] = new Truck("Mann", 80, 35, false, 8_000);
        vehicles[2] = new Car("Toyota Camry", 50, 8, false);
        vehicles[3] = new Truck("Autobus", 180, 50, false, 14_000);

        printVehicleInfo(vehicles);

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].setAcOn(true);
        }
        System.out.println();
        printVehicleInfo(vehicles);
    }

    private static void printVehicleInfo(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            vehicle.printInfo();
        }
    }
}
