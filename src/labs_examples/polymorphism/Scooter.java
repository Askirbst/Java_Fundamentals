package labs_examples.polymorphism;

public class Scooter implements MotorizedTransport {

    @Override
    public boolean start() {
        System.out.println("Starting scooter");
        return true;
    }

    @Override
    public void stop() {
        System.out.println("Stopping scooter");
    }

    @Override
    public void accelerate(int mph) {
        System.out.println("Scooter accelerating " + mph + " mph");
    }

    @Override
    public void decelerate(int mph) {
        System.out.println("Decelerating scooter");
    }
}
