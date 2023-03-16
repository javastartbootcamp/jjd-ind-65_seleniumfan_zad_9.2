package pl.javastart.task;

public class Car extends Vehicle {
    boolean isAcOn;
    private static final double EXTRA_CONSUMPTION_FOR_AC_ON = 0.8;

    public Car(String name, double tankCapacity, double averagePetrolConsumption, boolean isAcOn) {
        super(name, tankCapacity, averagePetrolConsumption);
        this.isAcOn = isAcOn;
    }

    public boolean isAcOn() {
        return isAcOn;
    }

    public void setAcOn(boolean acOn) {
        isAcOn = acOn;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.print(", klimatyzacja włączona? " + (isAcOn ? "tak" : "nie"));
    }

    @Override
    public double computeAveragePetrolConsumption() {
        return isAcOn ? getAveragePetrolConsumption() + EXTRA_CONSUMPTION_FOR_AC_ON : getAveragePetrolConsumption();
    }
}
