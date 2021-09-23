package labs_examples.inheritance;

import labs_examples.polymorphism.Scooter;

public class CarController {

    public static void main(String[] args) {
        Pickup pickup = new Pickup("Ford", "F150", 120000, 500);
        Sedan sedan = new Sedan("Honda", "Civic", 60000, 80);
        Motorcycle moto = new Motorcycle("Ducati", "Monster", 30000, 1000, false);

        System.out.println(pickup.getMake() + " " + pickup.getModel() + " " +
                pickup.getMiles() + " " + pickup.getBedCapacity());
        pickup.start();
        pickup.accelerate(10);

        System.out.println(sedan.getMake() + " " + sedan.getModel() + " " +
                sedan.getMiles() + " " + sedan.getTrunkCapacity());
        sedan.start();
        sedan.accelerate(20);

        System.out.println(moto.getMake() + " " + moto.getModel() + " " +
                moto.getMiles() + " " + moto.getCc() + " " + moto.isTwoSeat());
        moto.start();
        moto.accelerate(100);
        moto.accelerate(30);

        moto.demonstrateThisSuper();

        Scooter motoScooter = new Scooter();

        motoScooter.start();
        motoScooter.accelerate(75);
    }
}
