package track.search.binary.adityaverma;

public class BinarySearchReverseSorted {

    public static void main(String[] args) {
        int[] arr = {20, 10, 8, 7, 5, 4, -1, -4};
        int search = 5;
        System.out.printf("Element %d is present at index %d.\n", search, binarySearchReverseSorted(arr, search));

    }

    public static int binarySearchReverseSorted(int[] arr, int search) {

        int start = 0, end = arr.length-1;
        int mid;

        while(start <= end) {

            mid = start + ((end-start)/2);

            if(search == arr[mid]) {
                return mid;
            } else if(search < arr[mid]) {
                // Go to right search space
                start = mid+1;

            } else {
                // Go to left search space
                end = mid-1;
            }
        }

        return -1;
    }
}
