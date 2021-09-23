package labs_examples.classes;

public class PersonController2 {

    public static void main(String[] args) {
        // For objects, like values ie. int or char, first letter is lower case
        // and every subsequent word is upper case.
        Person somePerson = new Person(29, 72, "Alex");
        Person someOtherPerson = new Person(30, 68, "Lora");

        System.out.println("The first person is named " + somePerson.name +
                " he/she is "+ somePerson.height + " inches tall and he/she is " +
                somePerson.age + " years old.");

        System.out.println("The second person is named " + someOtherPerson.name +
                " he/she is "+ someOtherPerson.height + " inches tall and he/she is " +
                someOtherPerson.age + " years old.");

    }
}
