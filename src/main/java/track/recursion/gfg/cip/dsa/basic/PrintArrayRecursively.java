package track.recursion.gfg.cip.dsa.basic;

public class PrintArrayRecursively {

    public static void main(String args[])
    {
        int[] arr = {5, 4, 2, 1};
        int N = 4;
        printArrayRecursively(arr, N);
    }

    public static void printArrayRecursively(int arr[], int n)
    {
        if(n == 0) return;
        System.out.print(arr[arr.length-n]);
        printArrayRecursively(arr, n-1);
    }
}
