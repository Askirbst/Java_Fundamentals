package labs_examples.inheritance;

public class Pickup extends Vehicle {

    private double bedCapacity;

    public Pickup(String make, String model, double miles, double bedCapacity) {
        super(make, model, miles);
        this.bedCapacity = bedCapacity;
    }

    public double getBedCapacity() {
        return bedCapacity;
    }

    public void setBedCapacity(double bedCapacity) {
        this.bedCapacity = bedCapacity;
    }

    @Override
    public void accelerate(int mph) {
        super.accelerate(mph);

    }
    // @Override
   // public boolean start() {
   //     System.out.println("Start pickup truck");
   //     return true;
   // }
}
