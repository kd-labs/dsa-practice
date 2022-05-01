package codingblocks.sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int[] nums = {5, 3, -9, 8, 1};
        selectionSort(nums);
        for (int num : nums) {
            System.out.print(num + "\t");
        }
        System.out.println();
    }

    private static void selectionSort(int[] nums) {
        int len = nums.length;
        int min;
        for(int i = 0 ; i < len - 1 ; i++) {
           min = i;
           for(int j = i + 1; j < len ; j++) {
                if(nums[j] < nums[min]) min = j;
           }

           // swap nums[i] and nums[min]
           nums[i] = nums[i] ^ nums[min];
           nums[min] = nums[min] ^ nums[i];
           nums[i] = nums[i] ^ nums[min];

        }
    }
}
