package labs_examples.arrays;

public class ArraysVideo {
    public static void main(String[] args) {
        int[] intArray = new int[5];

        intArray[0] = 97;
        intArray[1] = 12;
        intArray[2] = 45;
        intArray[3] = 24;
        intArray[4] = 63;

        for(int i = 0; i < intArray.length; i++){
            System.out.println("The array at the index of " + i + " has a value of " + intArray[i]);
        }
    }
}
