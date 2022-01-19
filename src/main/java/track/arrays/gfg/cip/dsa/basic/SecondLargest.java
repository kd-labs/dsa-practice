package track.arrays.gfg.cip.dsa.basic;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr1 = {10, 5, 8, 20};
        int[] arr2 = {20, 10, 20, 8, 12};
        int[] arr3 = {10, 10, 10};

        System.out.printf("Second largest element idx for %s is : %d\n", "arr1", secondLargestEleIdx(arr1));
        System.out.printf("Second largest element idx for %s is : %d\n", "arr2", secondLargestEleIdx(arr2));
        System.out.printf("Second largest element idx for %s is : %d\n", "arr3", secondLargestEleIdx(arr3));
    }

    private static int secondLargestEleIdx(int[] arr) {
        int res=-1, largest=0, len = arr.length;

        for(int idx = 1 ; idx < len ; idx++) {
            if(arr[idx] > arr[largest]) {
                res = largest;
                largest = idx;
            } else if(arr[idx] != arr[largest]) {
                if(res == -1 || arr[idx] > arr[res]) res = idx;
            }
        }

        return res;
    }
}
