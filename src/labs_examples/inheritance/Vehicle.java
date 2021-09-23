package labs_examples.inheritance;

import labs_examples.polymorphism.MotorizedTransport;
//abstract keyword allows you to not define all methods from MotorizedTransport
// class in Vehicle class - Notice there is no start() in Vehicle class
public abstract class Vehicle implements MotorizedTransport {
    protected String make;
    protected String model;
    protected double miles;
    //final variables are always capitalized
    public final double PI = 3.14159;

    public Vehicle(String make, String model, double miles) {
        this.make = make;
        this.model = model;
        this.miles = miles;
    }

    public void accelerate(double mph){
        System.out.println("vehicle accelerate by " + mph + " mph");
        //steps to accelerate vehicle
    }

    @Override
    public void stop() {
        System.out.println("Stopping vehicle");
    }

    @Override
    public void accelerate(int mph) {
        System.out.println("Accelerating vehicle");
    }

    @Override
    public void decelerate(int mph) {
        System.out.println("Decelerating vehicle");
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }
}
