package track.arrays.gfg.cip.dsa.basic;

public class LargestEleIndex {

    public static void main(String[] args) {
        int[] arr1 = {10, 5, 20, 8};
        System.out.printf("Largest element is at index : %d\n", largestEleIdx(arr1));
        int[] arr2 = {40, 8, 50, 100};
        System.out.printf("Largest element is at index : %d\n", largestEleIdx(arr2));
    }

    private static int largestEleIdx(int[] arr) {
        int res = 0, len = arr.length;
        for(int idx = 1 ; idx < len ; idx++) {
            if(arr[idx] > arr[res])
                res = idx;
        }
        return res;
    }
}
