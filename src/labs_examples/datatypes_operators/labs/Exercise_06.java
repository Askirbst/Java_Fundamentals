package labs_examples.datatypes_operators.labs;


/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {
        double p = 3.14159;
        double h = 5;
        double r = 3.14;
        double Area;
        double Volume;
        Volume = (p * r * r * h);
        Area = (2*p*r*h+2*p*r*r);
        System.out.println("The volume of the cylinder is " + Volume);
        System.out.println("The area of the cylinder is " + Area) ;
    }



}