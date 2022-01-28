package track.search.binary.adityaverma;

public class NumberOfTimesSortedArrayIsRotated2 {

    public static void main(String[] args) {

        int[] arr = {4,5,6,7,0,1,2};

        System.out.printf("Array is rotated %d times.\n", binarySearchSmallestElementIndex(arr));

    }

    public static int binarySearchSmallestElementIndex(int[] arr) {

        int start = 0, n = arr.length, end = n - 1, mid;

        while(start < end) {

            mid = start + (end - start)/2;

            if(arr[mid] > arr[end]) {
                start = mid + 1;
            } else
                end = mid;
        }
        return end;
    }
}
