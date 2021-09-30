package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Run the class below and study the output. What prints and why?
 *
 * Your answer:
 * The value 10 prints because a new object of class B is created but with reference to the A class.
 * So any call of object a will reference fields in class A.
 */
class A {
    int i = 10;
}

class B extends A {
    int i = 20;
}

public class Exercise_02 {

    public static void main(String[] args) {
        A a = new B();

        System.out.println(a.i);
    }
}