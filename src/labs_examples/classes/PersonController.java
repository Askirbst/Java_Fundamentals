package labs_examples.classes;

public class PersonController {

    public static void main(String[] args) {
        // For objects, like values ie. int or char, first letter is lower case
        // and every subsequent word is upper case.
        Person somePerson = new Person();
        Person someOtherPerson = new Person();

        somePerson.age = 29;
        somePerson.height = 72;
        somePerson.name = "Alex";

        someOtherPerson.age = 30;
        someOtherPerson.height = 68;
        someOtherPerson.name = "Lora";

        somePerson.name = "Bob";

        System.out.println("The first person is named " + somePerson.name +
                " he/she is "+ somePerson.height + " inches tall and he/she is " +
                somePerson.age + " years old.");

        System.out.println("The second person is named " + someOtherPerson.name +
                " he/she is "+ someOtherPerson.height + " inches tall and he/she is " +
                someOtherPerson.age + " years old.");
    }
}
