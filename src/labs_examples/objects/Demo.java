package labs_examples.objects;

public class Demo {

    public static void main(String[] args) {

        Oven oven = new Oven(true, "GE", 500);
        Dishwasher dishwasher = new Dishwasher(true, "Kenmore", 5);
        Refrigerator fridge = new Refrigerator(true, "GE", 30);
        Sink sink = new Sink(true, "GE", "Stainless Steel");
        Kitchen myKitchen = new Kitchen(dishwasher, oven, fridge, sink);

        Oven oven1 = new Oven(false, "Kenmore", 550);
        Dishwasher dishwasher1 = new Dishwasher(true, "GE", 2);
        Refrigerator fridge1= new Refrigerator(false, "Kenmore", 20);
        Sink sink1 = new Sink(true, "Kenmore", "Aluminum");
        Kitchen myKitchen1 = new Kitchen(dishwasher1, oven1, fridge1, sink1);

        System.out.println("My kitchen has a " + myKitchen.getOven().getBrand() + " oven " +
             "with a max temp of " + myKitchen.getOven().getMaxTemp());

        System.out.println("My other kitchen has a " + myKitchen1.getOven().getBrand() + " oven " +
                "with a max temp of " + myKitchen1.getOven().getMaxTemp());

        System.out.println(myKitchen.toString());


    }

}
