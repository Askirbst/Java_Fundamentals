package labs_examples.polymorphism;

public class Dependency {
//dependency injection
    MotorizedTransport transport;

    public Dependency(MotorizedTransport transport) {
        this.transport = transport;
    }

    public void testMethods(){
        transport.start();
        transport.accelerate(60);
        transport.stop();
        System.out.println("----------------------");
    }

    public void setTransport(MotorizedTransport transport) {
        this.transport = transport;
    }
}
