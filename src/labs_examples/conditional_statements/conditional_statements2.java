package labs_examples.conditional_statements;

public class conditional_statements2 {
    public static void main(String[] args) {
            // please write and run at least 3 unique if statements below
            int i = 10;
            int u = 20;
            if (u < 25){
                System.out.println("u is less than 25");
            }
            if (i < u){
                System.out.println("i is less than u");
            }
            if (i < 20){
                System.out.println("i is less than 20!");
            }
            // please write and run at least 2 unique if/else-if/else ladders below
            if (i > 12){
                System.out.println("i is greater than 12");
            }
            else if(i <= 10){
                System.out.println("i is less than equal to 10");
            }
            else
                System.out.println("i is less than 20");
            if (i == 10){
                System.out.println("i is equal to 10");
            }
            else if(i > 10){
                System.out.println("i is greater than 10");
            }
            else{
                System.out.println("i is not equal to 10");
            }
    }
}
