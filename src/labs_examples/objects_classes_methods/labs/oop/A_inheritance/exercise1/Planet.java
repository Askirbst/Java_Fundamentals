package labs_examples.objects_classes_methods.labs.oop.A_inheritance.exercise1;

public class Planet extends CelestialObject{
    private boolean hasWater;
    private boolean gasGiant;
    private boolean rocky;

    public Planet(String name, boolean gravity, boolean emitsLight, double mass, int radius, String comp, int rotation, boolean hasWater, boolean gasGiant, boolean rocky) {
        super(name, gravity, emitsLight, mass, radius, comp, rotation);
        this.hasWater = hasWater;
        this.gasGiant = gasGiant;
        this.rocky = rocky;
    }

    public boolean isHasWater() {
        return hasWater;
    }

    public void setHasWater(boolean hasWater) {
        this.hasWater = hasWater;
    }

    public boolean isGasGiant() {
        return gasGiant;
    }

    public void setGasGiant(boolean gasGiant) {
        this.gasGiant = gasGiant;
    }

    public boolean isRocky() {
        return rocky;
    }

    public void setRocky(boolean rocky) {
        this.rocky = rocky;
    }

    public boolean life(){
        if(hasWater){
            System.out.println("Planet has an important building block for life!");
        }
        return true;
    }

}
