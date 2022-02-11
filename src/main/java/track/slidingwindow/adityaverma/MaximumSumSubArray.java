package track.slidingwindow.adityaverma;

public class MaximumSumSubArray {

    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int res = maximumSumSubarray(arr, k);
        System.out.printf("Maximum sum of sub-array of size %d is : %d.\n", k, res);

    }

    private static int maximumSumSubarray(int[] arr, int k) {
        int i = 0, j = 0, res = Integer.MIN_VALUE, n = arr.length, sum = 0;

        while(j < n) {
           sum = sum + arr[j];

            // if window size is less than given size k, then
            // increment j
           if(j-i+1 < k) {
               j++;
           } else if(j-i+1 == k) { // if window size hits k, then calculate one ans from calculation
               res = Math.max(res, sum);

               // also, since window size has hit, then slide the window forward and maintain the window
               // size by incrementing j and i.
               // But before incrementing i, reverse the calculation of i from sum.
               j++;
               sum = sum - arr[i];
               i++;
           }

        }

        return res;
    }
}
