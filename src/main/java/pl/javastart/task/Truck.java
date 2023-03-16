package pl.javastart.task;

public class Truck extends Car {
    private int weight;
    private static final double EXTRA_CONSUMPTION_PER_WEIGHT = 0.005;
    private static final double EXTRA_CONSUMPTION_FOR_AC_ON = 1.6;

    public Truck(String name, double tankCapacity, double averagePetrolConsumption, boolean isAcOn, int weight) {
        super(name, tankCapacity, averagePetrolConsumption, isAcOn);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.print(", waga: " + weight);
    }

    @Override
    public double computeAveragePetrolConsumption() {
        double avgPetrolConsumptionPerTruck = getAveragePetrolConsumption() + EXTRA_CONSUMPTION_PER_WEIGHT * weight;
        double avgPetrolConsumptionPerTruckWithAc = avgPetrolConsumptionPerTruck + EXTRA_CONSUMPTION_FOR_AC_ON;
        return isAcOn ? avgPetrolConsumptionPerTruckWithAc : avgPetrolConsumptionPerTruck;
    }
}