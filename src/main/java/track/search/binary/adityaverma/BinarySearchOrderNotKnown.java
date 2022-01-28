package track.search.binary.adityaverma;

public class BinarySearchOrderNotKnown {

    public static void main(String[] args) {

        int[] arr1 = {-4, -1, 4, 5, 7, 8, 10, 20};
        int key1 = 4;
        System.out.printf("Element %d is present at index %d.\n", key1, binarySearchOrderAgnostic(arr1, key1));

        System.out.println();

        int[] arr2 = {20, 10, 8, 7, 5, 4, -1, -4};
        int key2 = 5;
        System.out.printf("Element %d is present at index %d.\n", key2, binarySearchOrderAgnostic(arr2, key2));


    }

    private static int binarySearchOrderAgnostic(int[] arr, int search) {
        int start = 0, end = arr.length-1;
        return arr[start] < arr[end] ? binarySearchAsc(arr, search) : binarySearchDsc(arr, search);
    }

    private static int binarySearchAsc(int[] arr, int search) {

        System.out.println("Calling Ascending Binary Search");

        int start = 0 , end = arr.length-1, mid;

        while(start <= end) {

            mid = start + ((end-start)/2);

            if(search == arr[mid]) {
                return mid;
            } else if(search < arr[mid]){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;

    }

    private static int binarySearchDsc(int[] arr, int search) {

        System.out.println("Calling Descending Binary Search");

        int start = 0 , end = arr.length-1, mid;

        while(start <= end) {

            mid = start + ((end-start)/2);

            if(search == arr[mid]) {
                return mid;
            } else if(search < arr[mid]){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }
}
