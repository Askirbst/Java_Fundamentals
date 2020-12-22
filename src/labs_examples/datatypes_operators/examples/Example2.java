package labs_examples.datatypes_operators.examples;

/*
   Use the Pythagorean theorem to find
   find the length of the hypotenuse
   given the lengths of the two opposing
   sides.
*/
class Hypot {
    public static void main(String args[]) {
        double a, b, c;

        a = 3;
        b = 4;

        // calls sqrt() method from Math class
        c = Math.sqrt(a*a + b*b);

        System.out.println("Hypotenuse is " +c);
    }
}