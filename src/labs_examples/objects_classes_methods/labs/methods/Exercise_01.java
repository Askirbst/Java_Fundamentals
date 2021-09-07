package labs_examples.objects_classes_methods.labs.methods;

import java.util.Scanner;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        int product = multiply();
        System.out.println(product);

        int quotient = divide();
        System.out.println(quotient);

        String pun = joke();
        System.out.println(pun);

        int seconds = years();
        System.out.println(seconds);

        int array = varargs();
        System.out.println(array);
    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int multiply(){
        int a = 25;
        int b = 5;
        return a * b;
    }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static int divide(){
        int a = 25;
        int b = 5;
        return a / b;
    }

    // 3) Create a static void method that will print a joke of your choice to the console
    public static String joke(){
        String a = "Why are programmers so good at dancing?\n" +
                "They have great algorithm.";
        String b = "Why did the aspiring programmer buy a pair of glasses?\n" +
                "So he could C#";
        String c = "Spiders are excellent programmers, they're just so great at debugging";
        return c;
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static int years(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number of years to convert to seconds: ");
        int num = scn.nextInt();
        return num * 31536000;

    }

    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static int varargs(){
        int[] array = new int[10];
        return array.length;
    }





}
