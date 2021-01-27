package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array.
 *      Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        Scanner s3 = new Scanner(System.in);
        Scanner s4 = new Scanner(System.in);
        Scanner s5 = new Scanner(System.in);
        Scanner s6 = new Scanner(System.in);
        Scanner s7 = new Scanner(System.in);
        Scanner s8 = new Scanner(System.in);
        Scanner s9 = new Scanner(System.in);
        Scanner s10 = new Scanner(System.in);
        System.out.println("Enter 10 numbers to calculate sum: ");
        int[] nums = new int[10];
        nums[0] = s1.nextInt();
        nums[1] = s2.nextInt();
        nums[2] = s3.nextInt();
        nums[3] = s4.nextInt();
        nums[4] = s5.nextInt();
        nums[5] = s6.nextInt();
        nums[6] = s7.nextInt();
        nums[7] = s8.nextInt();
        nums[8] = s9.nextInt();
        nums[9] = s10.nextInt();
        for(int i = 0; i < 10; i++){
            sum+=nums[i];
        }
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + sum/10);
    }
}