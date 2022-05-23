package codingblocks.sorting;

public class InsertionSort {

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 3, 6, 7, -8};

        insertionSort(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

    }

    private static void insertionSort(int[] arr){
        int len = arr.length, value, hole, ptr;

        for(int i = 1 ; i < len ; i++) {
            value = arr[i];
            ptr = i-1;
            hole=i;
            while(ptr >= 0 && arr[ptr] > value) {
                arr[ptr+1] = arr[ptr];
                hole--;
                ptr--;
            }
            arr[hole] = value;
        }
    }

//    private static void insertionSort(int[] nums) {
//
//        int item, j;
//        for(int i = 1 ; i < nums.length ; i++) {
//
//            item = nums[i];
//            j = i - 1;
//
//            while(j >= 0 && nums[j] > item) {
//                nums[j+1] = nums[j];
//                j--;
//            }
//            nums[++j] = item;
//        }
//    }
}
