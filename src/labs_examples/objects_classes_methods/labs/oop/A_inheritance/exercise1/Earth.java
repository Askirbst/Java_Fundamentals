package labs_examples.objects_classes_methods.labs.oop.A_inheritance.exercise1;

public class Earth extends Planet{
    private long population;

    public Earth(String name, boolean gravity, boolean emitsLight, double mass, int radius, String comp, int rotation, boolean hasWater, boolean gasGiant, boolean rocky, long population) {
        super(name, gravity, emitsLight, mass, radius, comp, rotation, hasWater, gasGiant, rocky);
        this.population = population;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }
}
