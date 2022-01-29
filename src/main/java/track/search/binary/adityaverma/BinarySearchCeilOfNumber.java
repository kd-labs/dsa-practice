package track.search.binary.adityaverma;

public class BinarySearchCeilOfNumber {

    public static void main(String[] args) {

        // TC 1
        int[] arr1 = {1, 2, 8, 10, 10, 12, 19};
        int target1 = 5;
        System.out.printf("Ceil of element %d is %d.\n", target1, arr1[binarySearchCeilOfNumber(arr1, target1)]);

        //TC 2
        int[] arr2 = {1, 2, 8, 10, 10, 12, 19};
        int target2 = 20;
        System.out.printf("Ceil of element %d is %d.\n", target2, arr2[binarySearchCeilOfNumber(arr2, target2)]);

    }

    private static int binarySearchCeilOfNumber(int[] arr, int target) {

        int start = 0, n = arr.length, end = n-1, mid, res=-1;

        while(start <= end) {

            mid = start + (end-start)/2;

            if(target == arr[mid]) return mid;
            else if(target < arr[mid]) {
                res = mid;
                end = mid - 1;
            } else start = mid + 1;

        }
        return res;
    }
}
