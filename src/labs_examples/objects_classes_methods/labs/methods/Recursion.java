package labs_examples.objects_classes_methods.labs.methods;

public class Recursion {
    public static void main(String[] args) {

        Recursion recursionTool = new Recursion();
        System.out.println("FACTORIAL: " + recursionTool.getFactorial(6));

    }

    public int getFactorial(int number) {
        System.out.println("Method " + number);
        //base case - this will be used to end the recursive calls
        if (number == 1) {
            System.out.println("Returned 1");
            return 1;

        } else {
            int result = number * getFactorial(number - 1);
            System.out.print("Result " + result);
            System.out.println(" : " + number + " * getFact(" + number + " - 1)");

            return result;
        }

    }
}