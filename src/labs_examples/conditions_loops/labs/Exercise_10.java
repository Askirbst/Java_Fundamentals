package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 100: ");
        int scn1 = scanner.nextInt();
        for(scn1 = scn1; scn1 <= 100; scn1++){
            if(scn1 % 5 == 0 || scn1 % 3 == 0){
                continue;
            }
            System.out.println(scn1);
        }
        System.out.println("Between the number entered and 100 all numbers divisible by 3 and 5 are excluded");
    }
}
