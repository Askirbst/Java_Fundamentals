package labs_examples.datatypes_operators.examples;

// Demonstrate dynamic initialization.
class DynInit {
    public static void main(String args[]) {
        double radius = 4, height = 5;

        // dynamically initialize volume
        double volume = 3.14159 * radius * radius * height;
        System.out.println("The volume of the cylinder is " + volume);
    }
}
