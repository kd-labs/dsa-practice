package track.arrays.gfg.cip.dsa.basic.problems;

public class ImmediateSmallerThanX {

    public static int immediateSmaller(int arr[], int n, int x)
    {
        // Your code here
        int res = Integer.MIN_VALUE;
        for(int idx = 0 ; idx < n ; idx++) {
            if(arr[idx] < x && res < arr[idx]) res = arr[idx];
        }
        return res == Integer.MIN_VALUE ? -1 : res;
    }

    public static void main(String[] args) {
        int[] arr1 = {4 ,67 ,13 ,12 ,15};
        int[] arr2 = {1, 2, 3, 4, 5};

        System.out.println(immediateSmaller(arr1, 5, 16));
        System.out.println(immediateSmaller(arr2, 5, 1));
    }
}
