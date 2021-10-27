package labs_examples.static_nonstatic.variables;

public class StaticController {

    public static void main(String[] args) {
        House house1 = new House(100, "123 A Street");
        House house2 = new House(200, "321 B Street");
        House house3 = new House(500, "456 C Street");
        System.out.println(house1);
        System.out.println(house3);
        System.out.println(house2);

    }
}
