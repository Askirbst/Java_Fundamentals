package labs_examples.objects_classes_methods.labs.objects;

public class Wings {
    public static Wings myWings;
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
