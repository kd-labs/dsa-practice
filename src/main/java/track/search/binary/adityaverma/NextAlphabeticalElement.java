package track.search.binary.adityaverma;

public class NextAlphabeticalElement {

    public static void main(String[] args) {

        char[] arr = {'c','f','j'};
        char target = 'c';

        System.out.printf("Next alphabet after target %c is %c.\n", target,
                arr[binarySearchNextAlphabeticalElement(arr, target)]);
    }

    private static int binarySearchNextAlphabeticalElement(char[] arr, char target) {

        int start = 0, n = arr.length, end = n-1, mid, res=-1;

        while(start <= end) {

            mid = start + (end-start)/2;

            if(target == arr[mid]) {
                return mid+1;
            } else if(target < arr[mid]) {
                res = mid;
                end = mid-1;
            } else start = mid + 1;

        }

        return res;

    }
}
