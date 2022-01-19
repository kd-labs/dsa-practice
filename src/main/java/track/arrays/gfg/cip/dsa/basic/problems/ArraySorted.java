package track.arrays.gfg.cip.dsa.basic.problems;

public class ArraySorted {

    public static int isSorted(int arr[], int n)
    {
        boolean hasChanged = false;
        String order = null;
        for(int idx = 0; idx < arr.length-1 ; idx++) {
            if(arr[idx] == arr[idx+1])
                continue;
            else if (arr[idx] < arr[idx+1]) {
                order = "increasing";
                break;
            } else {
                order = "decreasing";
                break;
            }
        }

        for(int idx = 0 ; idx < arr.length-1 ; idx++) {
            if(arr[idx] == arr[idx+1]) continue;
            else if(order.equals("increasing") && arr[idx] > arr[idx+1]) {
                hasChanged = true;
                break;
            } else if (order.equals("decreasing") && arr[idx] < arr[idx+1]) {
                hasChanged = true;
                break;
            }
        }

        return hasChanged ? 0 : 1;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 1, 2, 2, 3};
        System.out.printf("is %s sorted ? : %d\n", "arr1", isSorted(arr1, 5));

        int[] arr2 = {1, 1, 2, 4, 3};
        System.out.printf("is %s sorted ? : %d\n", "arr2", isSorted(arr2, 5));
    }
}
