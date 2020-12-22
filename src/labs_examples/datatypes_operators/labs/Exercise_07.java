package labs_examples.datatypes_operators.labs;

import java.util.Scanner;

/**
 * Fundamentals Exercise 5: Days to seconds
 *
 *      Take in a number in days from the user between 1 and 1,000,000 and convert it to
 *      seconds.
 *
 *      NOTE: We will be using the Scanner class to collect user input. This is demonstrated below.
 *
 */

public class Exercise_07 {

    public static void main(String[] args) {

        // create scanner
        // prompt user
        // assign input to variable as int
        double days = 33333;
        double hrs = 24;
        double min = 60;
        double secs = 60;
        double seconds;
        seconds = (days * hrs * min * secs);
        System.out.println("Number of seconds in 33,333 days is " + seconds);


        // write completed code here

    }
}