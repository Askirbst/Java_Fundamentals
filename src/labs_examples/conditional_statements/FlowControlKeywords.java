package labs_examples.conditional_statements;

import org.w3c.dom.ls.LSOutput;

public class FlowControlKeywords {
    public static void main(String[] args) {

        //FLOW CONTROL
        //Continue, break, return
        //continue
         for(int i = 0; i < 10; i++) {
             if (i == 3 || i == 7) {
                 //forces an early iteration of the loop
                 continue;
             }
             System.out.println("i = " + i);
         }
        System.out.println("End of continue");

         //break
         for(int i = 0; i < 10; i++){
            if(i == 3 || i == 7){
                //exits the nearest loop
                break;
            }
            System.out.println("i = " + i);
        }
        System.out.println("End of break");

        int i = someMethod(1);
        System.out.println("i = " + i);
}

    public static int someMethod(int val) {

        if (val == 0) {
            System.out.println("1) Will this print?");
            return 0;
            //return exits the current method (will return a value if the method requires)
        } else if (val == 1) {
            System.out.println("2) Will this print?");
            return 1;
            //return exits the current method (will return a value if the method requires)
        } else {
            System.out.println("3) Will this print?");
            return -1;
            //return exits the current method (will return a value if the method requires)
        }
    }
}
