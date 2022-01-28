package track.search.binary.adityaverma;

public class BinarySearchCountElementInSortedArray {

    public static void main(String[] args) {

        int[] arr = {5,7,7,7,8,8,10};
        int search = 7;

        int first = BinarySearchFirstAndLastOccurrence.binarySearchFirstOccurrence(arr, search);
        int last = BinarySearchFirstAndLastOccurrence.binarySearchLastOccurrence(arr, search);

        System.out.printf("Count of %d in sorted array is %d\n", search, (last-first+1));
    }
}
