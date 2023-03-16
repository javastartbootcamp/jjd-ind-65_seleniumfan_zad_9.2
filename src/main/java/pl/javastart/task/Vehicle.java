package pl.javastart.task;

public class Vehicle {
    private String name;
    private double tankCapacity;
    private double averagePetrolConsumption;
    private static final int HUNDRED_KILOMETERS = 100;

    public Vehicle(String name, double tankCapacity, double averagePetrolConsumption) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.averagePetrolConsumption = averagePetrolConsumption;
    }

    public double range() {
        return (tankCapacity * HUNDRED_KILOMETERS) / computeAveragePetrolConsumption();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getAveragePetrolConsumption() {
        return averagePetrolConsumption;
    }

    public void setAveragePetrolConsumption(double averagePetrolConsumption) {
        this.averagePetrolConsumption = averagePetrolConsumption;
    }

    public double computeAveragePetrolConsumption() {
        return averagePetrolConsumption;
    }

    public void printInfo() {
        System.out.printf("\n%-13s: pojemność baku: %-6.2f l, średnie spalanie na 100 km: %-5.2f l, zasięg pojazdu: %.2f km",
                name, tankCapacity, computeAveragePetrolConsumption(), range());
    }
}
