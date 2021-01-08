package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Enter a number less than 100: ");

        int l = scanner1.nextInt();

        for(l = l; l <= 100; l++) {
            if (l == 12 || l == 27) {
                break;
            }
            System.out.println("l = " + l);
        }
    }
}
