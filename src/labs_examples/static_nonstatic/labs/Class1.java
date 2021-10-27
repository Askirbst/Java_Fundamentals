package labs_examples.static_nonstatic.labs;

public class Class1 {

    public static void main(String[] args) {
        System.out.println("--------Static--------");

        System.out.println("--To static--");
        int x = multiply(2,3);
        System.out.println(x);

        System.out.println("--To nonstatic--");
        Class1 obj = new Class1();
        int y = obj.multiply2(2,3);
        System.out.println(y);

        System.out.println("--To static of a different class--");
        Class2.staticMethod();

        System.out.println("--To nonstatic of a different class--");
        Class2 obj2 = new Class2();
        obj2.nonStaticMethod();

        System.out.println("--------Nonstatic--------");

        Class1 nonStaticObj = new Class1();
        nonStaticObj.nonStaticMain();

    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public int multiply2(int a, int b){
        return a * b;
    }

    public void nonStaticMain(){
        double x = divide(10,2);
        System.out.println("--To static--");
        System.out.println(x);

        double y = divide2(21,7);
        System.out.println("--To nonstatic--");
        System.out.println(y);

        Class2.staticMethod2();

        Class2 nonStaticObj2 = new Class2();
        nonStaticObj2.nonStaticMethod2();

    }

    public static double divide(double a, double b){
        if (b == 0){
            return -1;
        }else
            return a / b;
    }

    public double divide2(double a, double b){
        if (b == 0){
            return -1;
        }else
            return a / b;
    }

}
