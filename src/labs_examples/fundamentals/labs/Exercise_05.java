package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str1 = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str1"

        String str2 = "hello";
        // please initialize a boolean variable and test whether str1 is equal to str2
        boolean equalStrings = str1.equalsIgnoreCase(str2);

        System.out.println("The length of str1 is " + str1.length());
        System.out.println("The length of str2 is " + str2.length());
        System.out.println("Do str1 and str2 match?" + equalStrings);

        // please concatenate str & str2 and set the result to a new String variable below

        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc
        System.out.println("The length of str1 and str2 is ");
        System.out.println(str1.length() + str2.length());
    }


}