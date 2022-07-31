package codingblocks.sorting;

public class MergeSort {

    public static void main(String[] args) {

        int[] arr = {5, 3, 4, 1, 2};

        int[] sortedArr = mergeSort(arr, 0, arr.length-1);
        for (int i : sortedArr) {
            System.out.print(i + "\t");
        }

    }

    private static int[] mergeSort(int[] arr, int lo, int hi) {

        // Base Case
        if(lo == hi) {
            return new int[] {arr[lo]};
        }

//        int mid = lo + ((hi - lo) / 2);
        int mid = (lo + hi)  / 2;
        int[] leftSorted = mergeSort(arr, lo, mid);
        int[] rightSorted = mergeSort(arr, mid+1, hi);

        return merge(leftSorted, rightSorted);

    }

    private static int[] merge(int[] leftSorted, int[] rightSorted) {

        int[] sorted = new int[leftSorted.length + rightSorted.length];

        int leftPtr = 0, rightPtr = 0, resPtr = 0;

        while(leftPtr < leftSorted.length && rightPtr < rightSorted.length) {

            if(leftSorted[leftPtr] <= rightSorted[rightPtr]) {
                sorted[resPtr++] = leftSorted[leftPtr++];
            } else {
                sorted[resPtr++] = rightSorted[rightPtr++];
            }
        }

        while(leftPtr < leftSorted.length) {
            sorted[resPtr++] = leftSorted[leftPtr++];
        }

        while(rightPtr < rightSorted.length) {
            sorted[resPtr++] = rightSorted[rightPtr++];
        }

        return sorted;
    }
}
