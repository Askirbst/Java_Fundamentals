package labs_examples.conditions_loops.labs;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner scan = null;
        String str = null;
        Set<Character> vowels = null;
        char ch = '\0';
        scan = new Scanner(System.in);
        System.out.println("Enter word: ");
        str = scan.nextLine();
        str = str.toUpperCase();
        vowels = new HashSet<Character>();
        int i = 0;
        while(i < str.length()){
            ch = str.charAt(i);
            i++;
            while(ch >= 'A' && ch <= 'Z'){
                checkVowel
            }
        }
    }
}