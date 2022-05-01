package codingblocks.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {3, 9, 6, -9, -11};
        bubbleSort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "\t");
        }
        System.out.println();
    }

    private static void bubbleSort( int[] nums) {

        int len = nums.length;

        for(int pass = 1 ; pass <= len - 1; pass++) {
            for(int j = 0 ; j <= len-1-pass; j++) {
               if(nums[j] > nums[j+1]) {
                   nums[j] = nums[j] ^ nums[j+1];
                   nums[j+1] = nums[j+1] ^ nums[j];
                   nums[j] = nums[j] ^ nums[j+1];
               }
            }
            System.out.print("Pass " + pass + " : ");
            for (int num : nums) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }

}