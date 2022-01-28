package track.search.binary.adityaverma;

public class BinarySearchFirstAndLastOccurrence {

    public static void main(String[] args) {

        int[] arr = {5,7,7,7,8,8,10};
        int search_first = 8;
        int search_last = 7;
        System.out.printf("First Occurrence of element %d is %d\n", search_first, binarySearchFirstOccurrence(arr, search_first));
        System.out.println();
        System.out.printf("Last Occurrence of element %d is %d\n", search_last, binarySearchLastOccurrence(arr, search_last));

    }

    public static int binarySearchFirstOccurrence(int[] arr, int search) {

        int start = 0, end = arr.length-1, res = -1, mid;

        while(start <= end) {

            mid = start + ((end - start)/2);

            if(search == arr[mid]) {
                res = mid;
                end = mid-1;
            } else if(search < arr[mid]) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return res;
    }

    public static int binarySearchLastOccurrence(int[] arr, int search) {

        int start = 0, end = arr.length-1, res = -1, mid;

        while(start <= end) {

            mid = start + ((end - start)/2);

            if(search == arr[mid]) {
                res = mid;
                start = mid+1;
            } else if(search < arr[mid]) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return res;
    }
}
