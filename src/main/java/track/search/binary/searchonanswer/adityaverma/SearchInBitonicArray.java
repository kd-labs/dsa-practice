package track.search.binary.searchonanswer.adityaverma;

public class SearchInBitonicArray {

    public static void main(String[] args) {

        int[] arr = {-3, 9, 18, 20, 17, 5, 1};
        int target = 20;

        int peakIndex = PeakElement.searchPeakElement(arr);

        System.out.printf("Target %d is present at index %d.\n", target, searchInBitonicArray(arr, target, peakIndex));
    }

    private static int searchInBitonicArray(int[] arr, int target, int peakIndex) {

        if(target > arr[peakIndex]) return -1;
        else if(target == arr[peakIndex]) return peakIndex;
        else{
            int res1 = binarySearchAsc(arr, target, 0 , peakIndex-1);
            int res2 = binarySearchDsc(arr, target, peakIndex+1, arr.length-1);
            return (res1 == res2) ? -1 : (res1 != -1 ? res1 : res2);
        }
    }

    private static int binarySearchAsc(int[] arr, int target, int start, int end) {

        int mid;

        while(start <= end) {

            mid = start + (end-start)/2;

            if(arr[mid] == target) {
                return mid;
            } else if(target < arr[mid]) {
                end = mid-1;
            } else start = mid+1;
        }
        return -1;
    }

    private static int binarySearchDsc(int[] arr, int target, int start, int end) {

        int mid;

        while(start <= end) {

            mid = start + (end-start)/2;

            if(arr[mid] == target) {
                return mid;
            } else if(target < arr[mid]) {
                start = mid+1;
            } else
                end = mid-1;
        }
        return -1;
    }
}
