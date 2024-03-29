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
        System.out.print("The product is: ");
        System.out.println(product);

        int quotient = divide();
        System.out.print("The quotient is: ");
        System.out.println(quotient);

        String pun = joke();
        System.out.println(pun);

        int seconds = years();
        System.out.println(seconds);

        int count1 = varargs("one", "two", "three");
        int count2 = varargs("one", "two");
        int count3 = varargs("one");

        System.out.println("count1 is " + count1);
        System.out.println("count2 is " + count2);
        System.out.println("count3 is " + count3);

        boolean isTrue = isOdd();
        System.out.println(isTrue);

        String phrase = reverse();
        System.out.println("Reversed string is:");
        System.out.println(phrase);
    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int multiply() {
        int a = 25;
        int b = 5;
        return a * b;
    }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static int divide() {
        int a = 25;
        int b = 5;
        return a / b;
    }

    // 3) Create a static void method that will print a joke of your choice to the console
    public static String joke() {
        return "Spiders are excellent programmers, they're just so great at debugging";
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static int years() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number of years to convert to seconds: ");
        int num = scn.nextInt();
        return num * 31536000;

    }

    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static int varargs(String... args) {
        int count = 0;

        for(String s : args){
            count++;
        }
        return count;
    }

    public static boolean isOdd() {
        System.out.println("Enter number to determine if odd");
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        return num % 2 != 0;
    }

    public static String reverse(){
        System.out.println("Enter phrase to reverse:");
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        String reverse = "";

        for(int i = str.length() - 1; i >= 0; i--){
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }

}
