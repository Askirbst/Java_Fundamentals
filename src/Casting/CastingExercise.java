package Casting;

public class CastingExercise {

        public static void main(String[] args) {

            // please demonstrate converting an int to a double below
            // - example - why don't we need to cast the int to a double?
            int i = 333;
            double d = i;
            System.out.println("double value " + i);

            // please demonstrate casting a double to an int below
            double t = 100.002;
            int r = (int) t;
            System.out.println("int value " + r);
            // please demonstrate casting a double to a float below
            double g = 200.022123;
            float c = (float) g;
            System.out.println("float value " + c);
            // please demonstrate casting a double with decimal values to an short
            double v = 20.123;
            short h = (short) v;
            System.out.println("short value " + h);
            // now print out the short value - what happened to the decimals?
            //decimals are gone
            double x = 5;
            double y = 2;
            double result = x / y;
            System.out.println(result);

            double val = 23.45;
            int intVal = (int) val;
            System.out.println(intVal);
        }
}
