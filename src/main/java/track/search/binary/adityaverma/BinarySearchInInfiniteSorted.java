package track.search.binary.adityaverma;

public class BinarySearchInInfiniteSorted {

    public static void main(String[] args) {

        int[] arr = new int[]{3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int ans = binarySearchInfiniteSorted(arr,10);
        System.out.printf("Position of element %d in sorted array is %d\n.", 10, ans);

    }

    private static int binarySearchInfiniteSorted(int[] arr, int target) {
        int start = 0, end = 1, mid;

            while(arr[end] < target) {
                start = end;
                end = end * 2;
            }

            while(start <= end) {

                mid = start + (end-start)/2;

                if(arr[mid] == target) {
                    return mid;
                } else if(target < arr[mid]) {
                    end = mid - 1;
                } else
                    start = mid + 1;
            }
        return -1;
    }
}
