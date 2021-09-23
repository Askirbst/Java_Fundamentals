package labs_examples.objects_classes_methods.labs.methods;

/**
 * Create a recursive method named factorial that will return the factorial of any number passed to it.
 *
 * For instance, after creating the factorial method, uncomment the two lines in the main() method. When you run
 * it, it should print 120. It should also work for any other number you pass it.
 *
 */
public class Exercise_04 {

    private static char[] Char;

    public static void main(String[] args) {
        int x = factorial(10);
        System.out.println(x);

    }

    static int factorial(int x){
        if(x == 1) {
            return 1;
        }
        else{
            return x * factorial(x - 1);
        }
    }



}

