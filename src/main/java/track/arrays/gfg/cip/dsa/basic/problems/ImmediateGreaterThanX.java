package track.arrays.gfg.cip.dsa.basic.problems;

public class ImmediateGreaterThanX {

    public static int immediateGreater(int arr[], int n, int x)
    {
        int res = Integer.MAX_VALUE;
        for(int idx = 0 ; idx < n ; idx++) {
            if(arr[idx] > x && res > arr[idx]) res = arr[idx];
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 67, 13, 12, 15};
        int[] arr2 = {1, 2, 3, 4, 5};

        System.out.println(immediateGreater(arr1, 5, 16));
        System.out.println(immediateGreater(arr2, 5, 1));
        System.out.println(immediateGreater(arr2, 5, 5));
    }
}
