package track.search.binary.searchonanswer.adityaverma;

public class PeakElement {

    public static void main(String[] args) {

        int[] arr = {10, 20, 15, 2, 23, 90, 67};
        System.out.printf("Peak element in given arr is %d.\n", arr[searchPeakElement(arr)]);
    }

    private static int searchPeakElement(int[] arr) {
        int start = 0, n = arr.length, end = n-1, mid, res = -1;

        while(start <= end) {

            mid = start + (end-start)/2;

            if(mid > 0 && mid < n) {
               if(arr[mid] > arr[mid-1] &&
                    arr[mid] > arr[mid+1]) {
                   return mid;
               } else if(arr[mid] < arr[mid+1]) {
                   start = mid+1;
               } else {
                   end = mid - 1;
               }
            } else if(mid == 0) {
                if(arr[mid] > arr[mid+1]) return mid;
            } else if(mid == (n-1)) {
                if(arr[mid] > arr[mid-1]) return mid;
            }
        }
        return res;
    }
}
