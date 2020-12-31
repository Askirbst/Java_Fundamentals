package labs_examples.conditional_statements;

public class SwitchStatementRepl {

    public static void main(String[] args) {

        // please demonstrate the use of a switch statement below -
        // have a "System.out.println()" statement print for each "case" -
        // be sure to include "break" statements in each case

        // once you've got that done
        // run the switch statement with and without the break statements for each case -
        // what happens when we don't have break statements?
        int i = 3;

        switch (i){
            case 0:
                System.out.println("case is 0");
                break;
            case 1:
                System.out.println("case is 1");
                break;
            case 2:
                System.out.println("case is 2");
                break;
            case 3:
                System.out.println("case is 3");
                break;
            case 4:
                System.out.println("case is 4");
                break;
            default:
                System.out.println("Default switch");

        }

    }

}
