package track.search.binary.adityaverma;

public class NumberOfTimesSortedArrayIsRotated {

    public static void main(String[] args) {

        int[] arr = {4,5,6,7,0,1,2};

        System.out.printf("Array is rotated %d times.\n", binarySearchSmallestElementIndex(arr));

    }

    public static int binarySearchSmallestElementIndex(int[] arr) {

        int start = 0, n = arr.length, end = n-1, mid, prev, next;

        while(start <= end) {

            mid = start + (end-start)/2;

            prev = (mid-1+n)%n;
            next = (mid+1)%n;

            if(arr[mid] <= arr[prev] && arr[mid] <= arr[next]) {
                return mid;
            } else if(arr[mid] <= arr[end]) {
                end = mid-1;
            } else if(arr[start] <= arr[mid]) {
                start = mid + 1;
            }
        }

        return 0;
    }
}
