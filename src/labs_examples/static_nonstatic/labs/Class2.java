package labs_examples.static_nonstatic.labs;

public class Class2 {

    public static void staticMethod(){
        System.out.println("Static method calling a static method in another class");
    }

    public void nonStaticMethod(){
        System.out.println("Static method calling a nonstatic method in another class");
    }

    public static void staticMethod2(){
        System.out.println("Nonstatic method calling a static method in another class");
    }

    public void nonStaticMethod2(){
        System.out.println("Nonstatic method calling a nonstatic method in another class");
    }
}
