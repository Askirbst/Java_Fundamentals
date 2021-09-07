package labs_examples.objects_classes_methods.labs.objects;

public class Hull{
    public static Hull myHull;
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


