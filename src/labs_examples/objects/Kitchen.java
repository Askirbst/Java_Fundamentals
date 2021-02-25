package labs_examples.objects;

public class Kitchen {

    Dishwasher dishwasher;
    Oven oven;
    Refrigerator fridge;
    Sink sink;

    public Kitchen(Dishwasher dishwasher, Oven oven, Refrigerator fridge, Sink sink) {
        this.dishwasher = dishwasher;
        this.oven = oven;
        this.fridge = fridge;
        this.sink = sink;
    }

    public Dishwasher getDishwasher() {
        return dishwasher;
    }

    public void setDishwasher(Dishwasher dishwasher) {
        this.dishwasher = dishwasher;
    }

    public Oven getOven() {
        return oven;
    }

    public void setOven(Oven oven) {
        this.oven = oven;
    }

    public Refrigerator getFridge() {
        return fridge;
    }

    public void setFridge(Refrigerator fridge) {
        this.fridge = fridge;
    }

    public Sink getSink() {
        return sink;
    }

    public void setSink(Sink sink) {
        this.sink = sink;
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "\ndishwasher=" + dishwasher.toString() +
                "\n, oven=" + oven.toString() +
                "\n, fridge=" + fridge.toString() +
                "\n, sink=" + sink.toString() +
                '}';
    }
}
