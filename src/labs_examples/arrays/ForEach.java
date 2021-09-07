package labs_examples.arrays;

public class ForEach {
    public static void main(String[] args) {
        int[][] nums = new int[5][10];
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[i].length; j++){
                nums[i][j] = (i * j) * 7 / 3;//populates 2d array at i and j
            }
        }// : means "in"
        for(int[] outer : nums){
            for(int val : outer){
                System.out.print(val + "\t" + " -> " + "\t");
            }
            System.out.println();
        }
    }
}
