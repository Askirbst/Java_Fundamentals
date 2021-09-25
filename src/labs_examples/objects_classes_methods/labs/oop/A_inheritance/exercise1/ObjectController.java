package labs_examples.objects_classes_methods.labs.oop.A_inheritance.exercise1;

public class ObjectController {
    public static void main(String[] args) {
        Earth earth = new Earth("Earth", true, false, 5.972, 3959, "iron", 460, true, false, true, 8000000000L);
        System.out.println(earth.getName() + " has a mass of " + earth.getMass() + "* 10^21t. " + "With a rotation speed of " + earth.getRotation() + " meters per second and a radius of "
        + earth.getRadius() + " miles.");
    }
}
