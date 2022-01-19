package track.arrays.gfg.cip.dsa.basic;

public class ArraySorted {

    public static void main(String[] args) {
        int[] arr1 = {8, 12, 15};
        int[] arr2 = {8, 10, 10, 15};
        int[] arr3 = {100, 20, 200};
        int[] arr4 = {100};

        System.out.printf("Array %s is %s sorted\n", "arr1", isSorted(arr1) ? "" : "not");
        System.out.printf("Array %s is %s sorted\n", "arr2", isSorted(arr2) ? "" : "not");
        System.out.printf("Array %s is %s sorted\n", "arr3", isSorted(arr3) ? "" : "not");
        System.out.printf("Array %s is %s sorted\n", "arr4", isSorted(arr4) ? "" : "not");
    }

    private static boolean isSorted(int[] arr) {
        int len = arr.length;
        for(int idx = 0 ; idx < len - 1; idx++) {
            if(!(arr[idx] <= arr[idx+1]))
                return false;
        }
        return true;
    }
}
