package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1, 2, 3,...7 to see the day of the week:");
        int number = scanner.nextInt();
        if (number == 1) {
            System.out.println("Sunday");
        }
        if (number == 2) {
            System.out.println("Monday");
        }
        if (number == 3) {
            System.out.println("Tuesday");
        }
        if (number == 4) {
            System.out.println("Wednesday");
        }
        if (number == 5) {
            System.out.println("Thursday");
        }
        if (number == 6) {
            System.out.println("Friday");
        }
        if (number == 7) {
            System.out.println("Saturday");
        }
        else if(number >= 8) {
            System.out.println("Not Applicable");
        }

        // 1) create scanner (don't forget to import Scanner!)
        // 2) prompt user
        // 3) assign input to variable as int
        // 4) write completed code here

    }
}

