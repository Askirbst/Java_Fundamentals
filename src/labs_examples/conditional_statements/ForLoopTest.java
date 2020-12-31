package labs_examples.conditional_statements;

public class ForLoopTest {
    public static void main(String[] args){
        int val = 0;

        for( int i = 0; i <= 100; i++){
            System.out.println("i = " + i);
            for(val = 0; val <= 100; val++){
                System.out.println("-- val = " + val);
            }
        }

        // declare an int variable named "val" and set it to zero

        // write a for loop (with a counting variable named "i")
        // that will iterate from zero to 100 (inclusive),

        // incrementing by 1 on each loop

        // inside the for loop, add the value of "i" to the current value of "val"

    }
}
