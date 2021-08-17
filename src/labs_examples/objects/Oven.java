package labs_examples.objects;

public class Oven {

    private boolean gasRange;
    private String brand;
    private int maxTemp;

    public Oven(boolean gasRange, String brand, int maxTemp) {
        this.gasRange = gasRange;
        this.brand = brand;
        this.maxTemp = maxTemp;
    }

    public boolean isGasRange() {

        return gasRange;
    }

    public void setGasRange(boolean gasRange) {

        this.gasRange = gasRange;
    }

    public String getBrand() {

        return brand;
    }

    public void setBrand(String brand) {

        this.brand = brand;
    }

    public int getMaxTemp() {

        return maxTemp;
    }

    public void setMaxTemp(int maxTemp) {

        this.maxTemp = maxTemp;
    }

    @Override
    public String toString() {
        return "Oven{" +
                "gasRange=" + gasRange +
                ", brand='" + brand + '\'' +
                ", maxTemp=" + maxTemp +
                '}';
    }
}
