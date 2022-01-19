package track.arrays.gfg.cip.dsa.basic.problems;

public class ReverseArray {

    public static int reverseArray(int arr[], int n) {
        for(int idx = 0 ; idx < n/2 ; idx++) {
            arr[idx] = arr[idx] ^ arr[n-1-idx];
            arr[n-1-idx] = arr[idx] ^ arr[n-1-idx];
            arr[idx] = arr[idx] ^ arr[n-1-idx];
        }

        if(n % 2 == 1) {
            return arr[n/2];
        } else {
            return (int)Math.floor(arr[(int) Math.floor(n/2)] + arr[(int)Math.ceil(n/2)])/2;
        }

    }
}
