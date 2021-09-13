package labs_examples.objects_classes_methods.labs.methods;

import java.util.Scanner;

public class MethodTraining {

    public static void main(String[] args){
        //Method sum() is an example of method overloading
        int add1 = sum(1, 2, 3);
        System.out.println(add1);

        int add2 = sum(4, 5, 6, 7);
        System.out.println(add2);

        float add3 = sum(8.80f, 9.09f, 10.01f);
        System.out.println(add3);

        //Method pass() is an example of the difference between pass by value and pass by reference
        //Passing by value means it makes a copy of the variable and doesn't point to the original
        //variable itself. Java always passes by value.
        int x = pass(50);
        System.out.println(x);

        //Method max() will return the largest of 4 numbers
        int num = max(18, 99, 54, 12);
        System.out.println(num);

        System.out.println("Enter word to return number of consonants: ");
        int count = consonants();
        System.out.println("Number of consonants in given phrase is: " + count);
    }

    public static int sum(int a, int b, int c){
        return a + b + c;

    }

    public static int sum(int a, int b, int c, int d){
        return a + b + c + d;

    }

    public static float sum(float a, float b, float c){
        return a + b + c;

    }
    public static int pass(int val) {
        val = val * 2;
        return val;

    }

    public static int max(int a , int b, int c, int d){
        int[] array = new int[4];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        array[3] = d;

        int max = array[0];
        for(int i=1; i < 4; i++) {
            if (array[i] > max)
                max = array[i];

        }return max;

    }

    public static int consonants(){

        Scanner word = new Scanner(System.in);
        String scn = word.nextLine();

        int count = 0;
        for (int i = 0; i < scn.length(); i++){
            char ch = scn.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != ' ') {
                count++;

            }

        }return count;

    }

}
class Person {
    String name;
    int age;

    public Person (String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "name: " + name + "\n" + "age : " + age;
    }

    public void changeDetails(String name, int age){
        this.name = name;
        this.age = age;
    }

}

class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person("John", 21);
        Person person2;

        person2 = person1;

        person2.changeDetails("Mary", 30);

        System.out.println(person1);
    }
}