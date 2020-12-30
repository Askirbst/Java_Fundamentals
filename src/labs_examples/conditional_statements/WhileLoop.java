package labs_examples.conditional_statements;

public class WhileLoop {
    public static void main(String[] args) {

        int outterCount = 0;
        int innerCount = 0;

        while (outterCount < 10) {

            while (innerCount < 10){
                System.out.println("count is " + outterCount
                        + " and inner count = " + innerCount);
                innerCount++;
            }

            innerCount = 0;
            outterCount++;

        }

        System.out.println("All done!!");
    }
}
