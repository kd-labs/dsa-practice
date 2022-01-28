package track.search.binary.adityaverma;

public class NumberOfTimesSortedArrayIsRotated {

    public static void main(String[] args) {

        int[] arr = {3,4,5,1,2};

        System.out.printf("Array is rotated %d times.\n", binarySearchSmallestElement(arr));

    }

    private static int binarySearchSmallestElement(int[] arr) {
        int start = 0, end = arr.length-1, mid, res = -1;

        while(start <= end) {

            mid = start + ((end-start)/2);

            if(arr[mid] < arr[mid-1]&& arr[mid] < arr[mid+1]) {
                return mid;
            } else if(arr[start] < arr[mid]) {
                // means left side is sorted so go right
                start = mid+1;
            } else {
                // right side is sorted so go left
                end = mid-1;
            }

        }

       return res;
    }
}
