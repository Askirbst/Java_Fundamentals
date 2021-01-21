package labs_examples.arrays;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // create new ArrayList of String

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Programming");
        arrayList.add("is");
        arrayList.add("so");
        arrayList.add("cool");

        String val = arrayList.get(4);
        System.out.println(val);

        boolean check = arrayList.contains("Programming");
        System.out.println(check);

        for(String s : arrayList){
            System.out.println(s);
        }
    }
}
