package labs_examples.objects_classes_methods.labs.oop.A_inheritance.exercise1;

import labs_examples.objects_classes_methods.labs.oop.A_inheritance.exercise1.CelestialObject;

public class Star extends CelestialObject {
    private double luminosity;

    public Star(String name, boolean gravity, boolean emitsLight, double mass, int radius, String comp, int rotation, double luminosity) {
        super(name, gravity, emitsLight, mass, radius, comp, rotation);
        this.luminosity = luminosity;
    }

    public double getLuminosity() {
        return luminosity;
    }

    public void setLuminosity(double luminosity) {
        this.luminosity = luminosity;
    }
}
