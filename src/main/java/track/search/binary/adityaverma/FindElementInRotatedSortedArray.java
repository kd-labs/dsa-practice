package track.search.binary.adityaverma;

public class FindElementInRotatedSortedArray {

    public static void main(String[] args) {

        int[] tc1 = {4,5,6,7,0,1,2};
        int target1 = 0;

        System.out.printf("Position of element %d in rotated sorted array is %d.\n", target1, binarySearchRotatedSorted(tc1, target1));
        System.out.println();

        int[] tc2 = {4,5,6,7,0,1,2};
        int target2 = 3;
        System.out.printf("Position of element %d in rotated sorted array is %d.\n", target2, binarySearchRotatedSorted(tc2, target2));

    }

    private static int binarySearchRotatedSorted(int[] arr, int search) {

        int pivotIndex = NumberOfTimesSortedArrayIsRotated.binarySearchSmallestElementIndex(arr);
        int leftSortedRes, rightSortedRes;

        if(arr[pivotIndex] == search) return pivotIndex;
        else {

            leftSortedRes = binarySearch(arr, search, 0, pivotIndex-1);
            rightSortedRes = binarySearch(arr, search, pivotIndex+1, arr.length-1);

        }
        return leftSortedRes == rightSortedRes ? leftSortedRes : (leftSortedRes != -1 ? leftSortedRes : rightSortedRes);
    }

    private static int binarySearch(int[] arr, int search, int start, int end) {

        int mid;

        while(start <= end) {

            mid = start + ((end-start)/2);

            if(arr[mid] == search) {
                return mid;
            } else if(search < arr[mid]) {
               end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }
}
