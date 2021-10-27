package labs_examples.static_nonstatic.examples;

public class Repl {
    public static void main(String[] args) {

        // demonstrate how to invoke both method in the MyMath class below
        int x = MyMath.multiply(2,3);
        System.out.println(x);
        int y = MyMath.divide(6,2);
        System.out.println(y);

    }
}

class MyMath{
    public static int multiply(int a, int b){
        return a * b;
    }

    public static int divide(int a, int b){
        if (b == 0){
            return -1;
        } else {
            return a/b;
        }
    }
}
