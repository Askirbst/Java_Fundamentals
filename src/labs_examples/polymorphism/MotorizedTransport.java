package labs_examples.polymorphism;
//instead of class we use interface
public interface MotorizedTransport {
//abstract methods/method signatures: methods with no body unless using default keyword
    public default boolean start(){
        System.out.println("default start");
        return true;
    }
    public void stop();
    public void accelerate(int mph);
    public void decelerate(int mph);
//nothing else needed in interface
}
