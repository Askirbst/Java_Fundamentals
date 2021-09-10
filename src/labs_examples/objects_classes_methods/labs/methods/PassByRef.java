package labs_examples.objects_classes_methods.labs.methods;


import labs_examples.classes.Person;

public class PassByRef {
    public static void main(String[] args) {
        //Person = Class; alex = object / upper case is class; lower case is object
        Person alex = new Person(30, 73, "Alex");

        System.out.println(alex.toString());

        addYearToPerson(alex);

        System.out.println(alex.toString());
    }

    public static void addYearToPerson(Person alex) {
        alex.age = alex.age + 1;
    }
}
