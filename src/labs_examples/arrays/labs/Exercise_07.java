package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {
        ArrayList<Integer> Int = new ArrayList<>();
        Int.add(543);
        Int.add(1230);
        Int.add(33);
        Int.add(679);
        Int.add(459);
        Int.add(12);
        Int.add(33);

        int val = Int.get(0);
        System.out.println(val);

        int pop = Int.hashCode();
        System.out.println(pop);

        Int.add(52859);

        Int.set(3, 0);
        
        System.out.println(Int);

    }
}
