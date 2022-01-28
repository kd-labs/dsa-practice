package track.search.binary.adityaverma;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {-4, -1, 4, 5, 7, 8, 10, 20};
        int search = 4;
        System.out.printf("Element %d is present at index %d.\n", search, binarySearch(arr, search));

    }

    public static int binarySearch(int[] arr, int search) {
        int start = 0, end = arr.length-1;
        int mid;

        while(start <= end) {

            mid = start + ((end-start)/2);

            if(search == arr[mid]){
                return mid;
            } else if(search < arr[mid]) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }
}
