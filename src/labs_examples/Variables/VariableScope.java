package labs_examples.Variables;

public class VariableScope {

    static int globalVar = 10;

    public static void main(String[] args) {
        Vehicle myCar = new Vehicle();
        myCar.make = "Nissan";
        myCar.model = "XTerra";
        myCar.year = 2012;

        if (myCar.make.equalsIgnoreCase("Toyota")){
            String message = "It's a Toyota";
            System.out.println(message);
        }
    }
    public static int multiply(int a, int b){

        int result = a * b * globalVar;
        return result;

    }

    public static int divide(int a, int b){
       int val = globalVar / a / b;
       return val;
    }

}

