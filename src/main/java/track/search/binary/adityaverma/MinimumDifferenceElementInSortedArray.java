package track.search.binary.adityaverma;

public class MinimumDifferenceElementInSortedArray {

    public static void main(String[] args) {

        int[] arr = {2, 5, 10, 12, 15};
        int target = 6;

        System.out.printf("Minimum difference element in array to target %d is %d.\n", target,
                minimumDifferenceElement(arr, target));

    }

    private static int minimumDifferenceElement(int[] arr, int target) {

        int start = 0, n = arr.length, end = n - 1, mid;

        while(start <= end) {

            mid = start + (end-start)/2;

            if(arr[mid] == target) return arr[mid];
            else if(target > arr[mid]) {
                start = mid + 1;
            } else end = mid - 1;
        }

        return (Math.abs(target-arr[start]) < Math.abs(target-arr[end])) ? arr[start] : arr[end];

    }
}
