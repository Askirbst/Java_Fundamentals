package labs_examples.objects;

public class Demo {

    public static void main(String[] args) {

        Oven oven = new Oven(true, "GE", 500);
        Dishwasher dishwasher = new Dishwasher(true, "Kenmore", 5);
        Refrigerator fridge = new Refrigerator(true, "GE", 30);
        Sink sink = new Sink(true, "GE", "Stainless Steel");
        Kitchen myKitchen = new Kitchen(dishwasher, oven, fridge, sink);

        // System.out.println("My kitchen has a " + myKitchen.getOven().getBrand() + " oven " +
        //      "with a max temp of " + myKitchen.getOven().getMaxTemp());

        System.out.println(myKitchen.toString());


    }

}
