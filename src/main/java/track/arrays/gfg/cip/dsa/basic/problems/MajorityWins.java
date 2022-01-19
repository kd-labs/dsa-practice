package track.arrays.gfg.cip.dsa.basic.problems;

import java.util.Arrays;

public class MajorityWins {

    public static int majorityWins(int arr[], int n, int x, int y) {
        int res = 0;
        int candidate = x < y ? x : y;
        for(int idx = 0 ; idx < n ; idx++) {
            if(arr[idx] == x) res++;
            else if(arr[idx] == y) res--;
        }

        Arrays.stream(arr).max();

        return res > 0 ? x : (res == 0 ? ((x < y) ? x : y) : y);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};

        System.out.println(majorityWins(arr, arr.length, 1, 7));
    }
}
