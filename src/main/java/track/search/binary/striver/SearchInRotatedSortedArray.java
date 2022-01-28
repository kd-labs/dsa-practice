package track.search.binary.striver;

public class SearchInRotatedSortedArray {

    public static void main(String[] args) {

        int[] tc1 = {4,5,6,7,0,1,2};
        int target1 = 0;

        System.out.printf("Position of element %d in rotated sorted array is %d.\n", target1, binarySearchRotatedSorted(tc1, target1));
        System.out.println();

        int[] tc2 = {4,5,6,7,0,1,2};
        int target2 = 3;
        System.out.printf("Position of element %d in rotated sorted array is %d.\n", target2, binarySearchRotatedSorted(tc2, target2));

    }

    private static int binarySearchRotatedSorted(int[] arr, int target) {

        int start = 0, n = arr.length, end = n - 1;

        while(start<=end) {

            int mid = start + (end - start) / 2;

            if(target == arr[mid]) return mid;
            else if (target < arr[mid] && target >= arr[start]) {
                end = mid-1;
            } else start = mid + 1;

        }

        return -1;
    }
}
