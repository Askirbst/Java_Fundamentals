package labs_examples.conditional_statements;

public class ForLoopsRepl {
    public static void main(String[] args) {
        // please use a for loop below to print out every number between 0 & 100
        // please use another for loop below to print out every
        // odd number between 100 and 0 in descending order
        // pleasure demonstrate "nesting" two for loops below
        for(int x = 0; x <= 100; x++){
            System.out.println("x = " + x);
        }
        for(int z = 99; z >= 0; z-=2){
            System.out.println("z = " + z);
        }
        for(int x = 0; x <= 100; x++){
            System.out.println("x = " + x);
            for(int y = 0; y <= 100; y++) {
                System.out.println("-- y = " + y);
            }
        }
    }
}

