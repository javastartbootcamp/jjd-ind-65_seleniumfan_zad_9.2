package pl.javastart.task;

public class Truck extends Car {
    private int weight;

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
    public double range() {
        return (getTankCapacity() * 100) / computeAveragePetrolConsumption();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.print(", waga: " + weight);
    }

    @Override
    public double computeAveragePetrolConsumption() {
        return isAcOn ? getAveragePetrolConsumption() + 1.6 + 0.005 * weight : getAveragePetrolConsumption() + 0.005 * weight;
    }
}
