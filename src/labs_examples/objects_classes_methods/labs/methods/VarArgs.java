package labs_examples.objects_classes_methods.labs.methods;

public class VarArgs {

    public static void main(String[] args) {
        int sum1 = add(2, 3, 4);
        System.out.println(sum1);

        int sum2 = add(5, 6, 7, 8, 9);
        System.out.println(sum2);

        int sum3 = add(10, 11, 12, 13, 14, 15);
        System.out.println(sum3);

    }

    public static int add(int... args){

        int count = 0;

        for(int s : args){
            count = count + s;
        }
        return count;
    }

}
