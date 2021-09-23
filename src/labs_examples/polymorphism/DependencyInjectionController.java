package labs_examples.polymorphism;

import labs_examples.inheritance.Motorcycle;
import labs_examples.inheritance.Pickup;
import labs_examples.inheritance.Sedan;

public class DependencyInjectionController {

    public static void main(String[] args) {

        Pickup pickup = new Pickup("Ford", "F150", 120000, 500);
        Sedan sedan = new Sedan("Honda", "Civic", 60000, 80);
        Motorcycle moto = new Motorcycle("Ducati", "Monster", 30000, 1000, false);
        Scooter scooter = new Scooter();
        Dependency example = new Dependency(pickup);
        example.testMethods();

        example.setTransport(sedan);
        example.testMethods();

        example.setTransport(moto);
        example.testMethods();

        example.setTransport(scooter);
        example.testMethods();

    }

}
