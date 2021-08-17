package labs_examples.objects_classes_methods.labs.objects;

public class AirplaneExample {

    public static void main(String[] args) {
        Engine myEngine = new Engine("Jet", 4000);
        Crew myCrew = new Crew(12, false, 2);
        Hull myHull = new Hull(80, 300, "Aluminum");
        Wings myWings = new Wings(150, true, true, true);
        Airplane myAirplane = new Airplane(myEngine, myCrew, myHull, myWings);
      System.out.println(myAirplane.toString());
        System.out.println( "My airplane is a " + myEngine.getEngineType() + " with " + myEngine.getHorsePower() + " Horse Power. "
        + "It has a crew of " + myCrew.getNumberOfStaff() + " and " + myCrew.getNumberOfPilots() + " pilots. " +
        "Its hull has " + myHull.getWindows() + " windows " + "and is made out of " + myHull.getMaterial() + " with a volume of " + myHull.getVolume() +
        " and wings that are " + myWings.getWingSpan() + " feet long.");
    }

}



