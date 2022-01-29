package track.search.binary.adityaverma;

public class Search1InInfiniteBinarySortedArray {

    public static void main(String[] args) {

        // TC 1
        int[] arr1 = {0, 0, 1, 1, 1, 1};
        System.out.printf("Index of first one is %d\n.", binarySearchInInfiniteBinarySortedArray(arr1));

        System.out.println();

        // TC 2
        int[] arr2 = {1, 1, 1, 1, 1, 1};
        System.out.printf("Index of first one is %d\n.", binarySearchInInfiniteBinarySortedArray(arr2));

    }

    private static int binarySearchInInfiniteBinarySortedArray(int[] arr) {
        int start = 0, end = 1, mid, res = -1;

        while(arr[end] != 1) {
            start = end;
            end = end * 2;
        }

        while(start <= end) {

            mid = start + (end-start)/2;

            if(arr[mid] == 1) {
                res = mid;
                end = mid-1;
            }
            else if(arr[mid] < 1) {
                start = mid + 1;
            }
        }
        return res;
    }
}
