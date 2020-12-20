package labs_examples.Variables;

public class Variables {

   static double val = 123.45;

    public static void main(String[] args) {

        Person myPerson = new Person("Alex", 29);
        Person yourPerson = new Person("Erik", 34);
        Person einstein = new Person("Enstein", 100);

        System.out.println(myPerson.toString());
        System.out.println(yourPerson.toString());
        System.out.println(einstein.toString());



        //double x = multiply(val, val * 2);
    }
        public static double multiply(double a, double b){
            double result = a * b;
            printNum(result);
            return result;
        }

        public static void printNum (double numToPrint){
            System.out.println(numToPrint);
            System.out.println(val);
        }
}