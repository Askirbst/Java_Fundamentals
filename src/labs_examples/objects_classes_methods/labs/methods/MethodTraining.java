package labs_examples.objects_classes_methods.labs.methods;

import java.util.Scanner;

import java.util.Arrays;

public class MethodTraining {

    public static void main(String[] args) {
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
        System.out.println("The largest of these numbers is : " + num);

        System.out.println("Enter phrase to return number of consonants: ");
        int count = consonants();
        System.out.println("Number of consonants in given phrase is: " + count);

        System.out.println("Enter number to determine if prime: ");
        prime();

        int[] a = numbers(0,1,56,23);

        System.out.println("The minimum and maximum values in the array, respectively, are : " + Arrays.toString(a));

    }

    public static int sum(int a, int b, int c) {
        System.out.print("The sum of " + a + " + " + b + " + " + c + " is: ");
        return a + b + c;

    }

    public static int sum(int a, int b, int c, int d) {
        System.out.print("The sum of " + a + " + " + b + " + " + c + " + " + d + " is: ");
        return a + b + c + d;

    }

    public static float sum(float a, float b, float c) {
        System.out.print("The sum of " + a + " + " + b + " + " + c + " is: ");
        return a + b + c;

    }

    public static int pass(int val) {
        val = val * 2;
        return val;

    }

    public static int max(int a, int b, int c, int d) {
        int[] array = new int[4];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        array[3] = d;

        int max = array[0];
        for (int i = 1; i < 4; i++) {
            if (array[i] > max)
                max = array[i];

        }

        return max;

    }

    public static int consonants() {

        Scanner word = new Scanner(System.in);
        String scn = word.nextLine();

        int count = 0;
        for (int i = 0; i < scn.length(); i++) {
            char ch = scn.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != ' ' && ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U' && ch != '!' && ch != '.' && ch != ',' && ch != '?') {
                count++;

            }

        }

        return count;

    }

    public static void prime() {

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int i, m, flag = 0;
        m = num / 2;
        if (num == 0 || num == 1) {
            System.out.println(num + " is not prime :(");
        } else {
            for (i = 2; i <= m; i++) {
                if (num % i == 0) {
                    System.out.println(num + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(num + " is prime!");
            }
        }

    }

    public static int[] numbers(int a, int b, int c, int d) {
        int[] array = new int[4];
        int min1 = a;
        int max1 = a;

        array[0] = a;
        array[1] = b;
        array[2] = c;
        array[3] = d;

        for (int i = 0; i < 4; i++) {
            if (array[i] < min1)
                min1 = array[i];
            if (array[i] > max1)
                max1 = array[i];

        }
        int[] minmax = new int[2];
        minmax[0] = min1;
        minmax[1] = max1;
        return minmax;

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