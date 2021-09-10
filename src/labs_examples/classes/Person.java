package labs_examples.classes;

/** This class is called a POJO or Plain Old Java Object
 * A POJO is a very simple object that describes a class
 */

public class Person {
    //Class is a blueprint for objects/instances

    //Instance Variables
    public int age;
    public double height;
    public String name;

    //Constructors
    public Person(int age, double height, String name){
        this.age = age;
        this.height = height;
        this.name = name;

    }

    public Person() {

    }

    //Methods
    //...

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}';
    }
}
