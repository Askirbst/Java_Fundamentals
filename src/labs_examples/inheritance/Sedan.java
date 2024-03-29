package labs_examples.inheritance;

public class Sedan extends Vehicle {

    private double trunkCapacity;

    public Sedan(String make, String model, double miles, double trunkCapacity) {
        super(make, model, miles);
        this.trunkCapacity = trunkCapacity;

    }

    public double getTrunkCapacity() {
        return trunkCapacity;
    }

    public void setTrunkCapacity(double trunkCapacity) {
        this.trunkCapacity = trunkCapacity;
    }

    @Override
    public boolean start() {
        System.out.println("Start sedan");
        return true;
    }
}
