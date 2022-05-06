package codingblocks.contests.contest_3061;

import java.util.Scanner;

/*
    Approach:

        Input :
            arr = [1, 2, 3, 4]

        1. create left product prefix array where each element in leftProduct[i] is the product
           of all elements to the left of arr[i]

                leftProduct = [1, 1, 2, 6]

        2. create right product prefix array where each element in rightProduct[i] is the product
           of all elements to the right of arr[i]

                rightProduct = [24, 12, 4, 1]

        3. product of array except itself[i] = leftProduct[i] * rightProduct[i]

                productExceptSelf = [24, 12, 8, 6]

 */
public class ProductArrayExceptSelf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();

        int i = 0;
        long[] arr = new long[arrSize];
        while(i < arrSize) {
           arr[i++] = sc.nextLong();
        }

        long[] productArr = productArrayExceptSelf(arr, arrSize);
        for (long k : productArr) {
            System.out.print(k + "\t");
        }
        System.out.println();
    }

    private static long[] productArrayExceptSelf(long[] arr, int arrSize) {
        long[] res = new long[arrSize];
        long[] leftProduct = new long[arrSize];
        long[] rightProduct = new long[arrSize];

        leftProduct[0] = 1;
        for(int i = 1; i < arrSize ; i++) {
            leftProduct[i] = leftProduct[i-1] * arr[i-1];
        }

        rightProduct[arrSize-1] = 1;
        for(int i = arrSize-2 ; i >= 0 ; i--) {
            rightProduct[i] = rightProduct[i+1] * arr[i+1];
        }

        for(int i = 0 ; i < arrSize ; i++) {
            res[i] = leftProduct[i] * rightProduct[i];
        }

        return res;
    }
}
