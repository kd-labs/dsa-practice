package codingblocks.contests.contest_3061;

import java.util.Arrays;
import java.util.Scanner;

public class FormBiggestNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0) {
            int size = sc.nextInt();
            String[] arr = new String[size];

            for(int i = 0 ; i < arr.length ; i++) {
                arr[i] = String.valueOf(sc.nextInt());
            }

            Arrays.sort(arr, (s1, s2) -> -s1.compareTo(s2));
            String res = String.join("", arr);
            System.out.println(res);
        }

    }


}
