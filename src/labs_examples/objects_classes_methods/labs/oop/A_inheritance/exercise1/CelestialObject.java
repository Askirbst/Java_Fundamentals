package labs_examples.objects_classes_methods.labs.oop.A_inheritance.exercise1;

class CelestialObject {
    protected String name;
    protected boolean gravity;
    protected boolean emitsLight;
    protected double mass;
    protected int radius;
    //comp = mineral/element composition
    protected String comp;
    protected int rotation;

    public CelestialObject(String name, boolean gravity, boolean emitsLight, double mass, int radius, String comp, int rotation) {
        this.name = name;
        this.gravity = gravity;
        this.emitsLight = emitsLight;
        this.mass = mass;
        this.radius = radius;
        this.comp = comp;
        this.rotation = rotation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGravity() {
        return gravity;
    }

    public void setGravity(boolean gravity) {
        this.gravity = gravity;
    }

    public boolean isEmitsLight() {
        return emitsLight;
    }

    public void setEmitsLight(boolean emitsLight) {
        this.emitsLight = emitsLight;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getComp() {
        return comp;
    }

    public void setComp(String comp) {
        this.comp = comp;
    }

    public int getRotation() {
        return rotation;
    }

    public void setRotation(int rotation) {
        this.rotation = rotation;
    }

    public void rotation(){
        System.out.println("Celestial object rotates at " + rotation + " mph.");
    }

}