package leetcode;

public class MergeSortedArray {

    public static void main(String[] args) {

        /*
        TC 1
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        merge(nums1, 3, nums2, 3);
        */

        // TC 2
        int[] nums1 = {0};
        int[] nums2 = {1};

        merge(nums1, 0, nums2, 1);

        for (int i : nums1) {
            System.out.print(i + " ");
        }
    }

    /**
     *  Input :
     *                ptr1      ansIdx
     *                 |        |
     *      a = [1, 2, 3, 0, 0, 0]
     *      b= [2, 5, 6]
     *                |
     *                ptr2
     *
     *  After one iteration :
     *                ptr1  ansIdx
     *                 |     |
     *      a = [1, 2, 3, 0, 0, 6]
     *      b= [2, 5, 6]
     *             |
     *            ptr2
     *
     *  Intuition :
     *      Fact : arrays 'a' and 'b' are sorted.
     *      Approach : use pointers at the end of both arrays and compare.
     *                 the one which is bigger get placed at ansIdx and then decrement. Also decrement the pointer
     *                 of bigger element
     *
     *                 This will run in while loop until ptr1 >=0 and ptr2 >=0
     *
     *
     */

    private static void merge(int[] nums1, int m, int[] nums2, int n) {

        int ansIdx = m + n - 1, ptr1 = m-1, ptr2 = n-1;

        while(ptr1 >= 0 && ptr2 >= 0) {

            if(nums1[ptr1] <= nums2[ptr2]) {
                nums1[ansIdx--] = nums2[ptr2--];
            } else {
                nums1[ansIdx--] = nums1[ptr1--];
            }

        }

        while(ptr1 >= 0) {
            nums1[ansIdx--] = nums1[ptr1--];
        }

        while(ptr2 >= 0) {
            nums1[ansIdx--] = nums2[ptr2--];
        }

    }
}
