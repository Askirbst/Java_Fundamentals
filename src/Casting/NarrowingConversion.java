package Casting;

public class NarrowingConversion {

        public static void main(String[] args)
        {
            double x = 10.23;
            System.out.println("x = " + x);
            int z = (int) x;
            System.out.println("z = " + z);
            double d = 100.04;
            System.out.println("d = " + d);
            long l = (long)d;
            System.out.println("l = " + l);
            int i = (int)l;
            System.out.println("i = " + i);
            System.out.println("Long value " + l);
            System.out.println("int value " + i);

        }

}
