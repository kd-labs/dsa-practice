package track.search.binary.adityaverma;

public class SearchInNearlySortedArray {

    public static void main(String[] args) {

        int[] arr = {10, 3, 40, 20, 50, 80, 70};
        int target = 40;

        System.out.printf("Element %d is present at index %d.\n", target, binarySearchInNearlySorted(arr, target));

    }

    private static int binarySearchInNearlySorted(int[] arr, int target) {

        int start = 0, n = arr.length, end = n - 1, mid;

        while(start <= end) {

            mid = start + (end-start)/2;

            if(target == arr[mid]) return mid;
            else if(mid > start && target == arr[mid-1]) return mid-1;
            else if(mid < end && target == arr[mid+1]) return mid-1;
            else if(target < arr[mid]) end = mid-2;
            else start = mid+2;

        }
        return -1;
    }
}
