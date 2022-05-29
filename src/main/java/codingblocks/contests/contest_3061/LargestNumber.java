package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while(tc-- > 0) {
            int size = sc.nextInt();
            String[] arr = new String[size];

            for(int i = 0 ; i < size ; i++) {
                arr[i] = String.valueOf(sc.nextInt());
            }

            String res = largestNumber(arr);
            System.out.println(res);
        }
    }

    private static String largestNumber(String[] arr) {

        for(int i = 0 ; i < arr.length-1 ; i++) {
           for(int j = i+1 ; j < arr.length ; j++) {
               if((arr[i] + arr[j]).compareTo(arr[j] + arr[i]) < 0) {
                   swap(arr, i, j);
               }
           }
        }

        return String.join("", arr);
    }

    private static void swap(String[] arr, int i, int j) {

        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
