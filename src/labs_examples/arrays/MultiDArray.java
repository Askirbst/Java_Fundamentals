package labs_examples.arrays;

public class MultiDArray {
    public static void main(String[] args) {
        int[][] vals = new int[5][5];

        int count = 0;

        for (int i = 0; i < vals.length; i++){
            for(int x = 0; x < vals[i].length; x++){
                vals[i][x] = i + x * 7/3;

                System.out.print("| " + vals[i][x] + " \t");
            }
            System.out.println();
        }
    }
}
