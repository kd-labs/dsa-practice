package track.recursion.aditya.verma;

import jdk.internal.util.xml.impl.Pair;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortArray {

    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 1};
        int[] sortedArray = sortArray(arr);
        Arrays.stream(sortedArray).forEach(System.out::println);
    }

    /*
        Hypothesis :
            This method sorts the passed array
            Ex :
                arr = {5,2,3,1}
                res = {1,2,3,5}
     */
    public static int[] sortArray(int[] arr) {

        Pair pair = null;
        /*
            Base :
                if size of array is 1, then return
         */
        if(arr.length == 1) return arr;

        /*
            Induction :
                1. pop the last element of array, thus reducing it's size by 1 i.e -1
                2. recursive call to sort smaller size array.
                3. insert popped element in sorted array => new recursion problem
         */
        int tmp = arr[arr.length-1];
        int[] smallerArr = Arrays.stream(arr, 0, arr.length - 1).toArray();
        int[] sortedArray = sortArray(smallerArr);

        /*
            New Recursion Problem :
                insert tmp in sortedArray
         */
        insert(sortedArray, tmp);

        return sortedArray;
    }

    public static int[] insert(int[] arr, int ele) {
        int[] newarr;
        int size = arr.length;
        if(arr[size-1] <= ele) {
            int newsize = size + 1;
            newarr = Arrays.copyOf(arr, newsize);
            newarr[newsize-1] = ele;
            return arr;
        }
        int tmp = arr[size-1];
        newarr = Arrays.stream(arr, 0, size-1).toArray();
        insert(newarr, ele);
        return newarr;
    }
}
