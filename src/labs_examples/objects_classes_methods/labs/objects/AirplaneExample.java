package labs_examples.objects_classes_methods.labs.objects;

public class AirplaneExample {

    public static void main(String[] args) {
        Engine myEngine = new Engine("Jet", 4000);
        Crew myCrew = new Crew(12, false, 2);
        Hull myHull = new Hull(80, 300, "Aluminum");
        Wings myWings = new Wings(150, true,true, true);
      //  Airplane myAirplane = new Airplane();
       // System.out.println(myAirplane.toString());
    }

}
class Airplane{
    double fuelCapacity;
    int currentFuelLevel;
    Engine engine;
    Crew crew;
    Hull hull;
    Wings wings;

    public Airplane(double fuelCapacity, int currentFuelLevel, Engine engine, Crew crew, Hull hull, Wings wings) {
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
        this.engine = engine;
        this.crew = crew;
        this.hull = hull;
        this.wings = wings;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "fuelCapacity=" + fuelCapacity +
                ", currentFuelLevel=" + currentFuelLevel +
                ", engine=" + engine +
                ", crew=" + crew +
                ", hull=" + hull +
                ", wings=" + wings +
                '}';
    }
}
class Engine {
    private String engineType;
    private int horsePower;

    public Engine(String engineType, int horsePower) {
        this.engineType = engineType;
        this.horsePower = horsePower;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engineType='" + engineType + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}

class Hull{
    private int windows;
    private double volume;
    private String material;

    public Hull(int windows, double volume, String material) {
        this.windows = windows;
        this.volume = volume;
        this.material = material;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Hull{" +
                "windows=" + windows +
                ", volume=" + volume +
                ", material='" + material + '\'' +
                '}';
    }
}

class Crew{
    private int numberOfStaff;
    private boolean allFemale;
    private int numberOfPilots;

    public Crew(int numberOfStaff, boolean allFemale, int numberOfPilots) {
        this.numberOfStaff = numberOfStaff;
        this.allFemale = allFemale;
        this.numberOfPilots = numberOfPilots;
    }

    public int getNumberOfStaff() {
        return numberOfStaff;
    }

    public void setNumberOfStaff(int numberOfStaff) {
        this.numberOfStaff = numberOfStaff;
    }

    public boolean isAllFemale() {
        return allFemale;
    }

    public void setAllFemale(boolean allFemale) {
        this.allFemale = allFemale;
    }

    public int getNumberOfPilots() {
        return numberOfPilots;
    }

    public void setNumberOfPilots(int numberOfPilots) {
        this.numberOfPilots = numberOfPilots;
    }

    @Override
    public String toString() {
        return "Crew{" +
                "numberOfStaff=" + numberOfStaff +
                ", allFemale=" + allFemale +
                ", numberOfPilots=" + numberOfPilots +
                '}';
    }
}

class Wings {
    private int wingSpan;
    private boolean winglet;
    private boolean horizontalStabilizer;
    private boolean verticalStabilizer;

    public Wings(int wingSpan, boolean winglet, boolean horizontalStabilizer, boolean verticalStabilizer) {
        this.wingSpan = wingSpan;
        this.winglet = winglet;
        this.horizontalStabilizer = horizontalStabilizer;
        this.verticalStabilizer = verticalStabilizer;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    public boolean isWinglet() {
        return winglet;
    }

    public void setWinglet(boolean winglet) {
        this.winglet = winglet;
    }

    public boolean isHorizontalStabilizer() {
        return horizontalStabilizer;
    }

    public void setHorizontalStabilizer(boolean horizontalStabilizer) {
        this.horizontalStabilizer = horizontalStabilizer;
    }

    public boolean isVerticalStabilizer() {
        return verticalStabilizer;
    }

    public void setVerticalStabilizer(boolean verticalStabilizer) {
        this.verticalStabilizer = verticalStabilizer;
    }

    @Override
    public String toString() {
        return "Wings{" +
                "wingSpan=" + wingSpan +
                ", winglet=" + winglet +
                ", horizontalStabilizer=" + horizontalStabilizer +
                ", verticalStabilizer=" + verticalStabilizer +
                '}';
    }
}

