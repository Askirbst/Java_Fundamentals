package labs_examples.conditional_statements;

public class IfStatements {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        if (a < b && a < 9) {
            // if statement code block
            System.out.println("a is less than b");
        } else if (b > 30) {
            System.out.println("a is greater than 30");
        } else if (b > 20) {
            System.out.println("a is less than equal to 10");
        } else if (b > 15) {

            if (b > 18) {
                if (b > 19) {
                    if (b == 20) {
                        System.out.println("b is 20");
                    }
                }
                 System.out.println("b is greater than 19");
                } else {
                    System.out.println("a is greater than 15 and less than 19");
                }

        } else if (b > 30) {
            System.out.println("a is greater than 30");
        } else {
            System.out.println("b is not greater than 30");
        }
    }
}