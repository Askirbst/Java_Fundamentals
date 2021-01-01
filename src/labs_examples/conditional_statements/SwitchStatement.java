package labs_examples.conditional_statements;

public class SwitchStatement {

    public static void main(String[] args) {

        int i = 4;

        switch (i) {
            case 0:
                System.out.println("i is 0");
                break;
            case 1:
                System.out.println("i is 1");
                break;
            case 2:
                System.out.println("i is 2");
                break;
            case 3:
                System.out.println("i is 3");
                break;
            case 4:
                System.out.println("i is 4");
                break;
            case 5:
                System.out.println("i is 5");
                break;
            default:
                System.out.println("default was hit");

        }
        //example of cascading effect when break is removed
        String str = "bronze";

        System.out.println("Your membership gives you access to the following levels");

        switch (str) {
            case "gold":
                System.out.println("gold level");
            case "silver":
                System.out.println("silver level");
            case "bronze":
                System.out.println("bronze level");

                System.out.println("Done with switch statements");

        }

    }
}