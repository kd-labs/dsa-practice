package dsa_revision.recursion;

import java.util.Scanner;

public class NTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();

        System.out.println(nTriangle(target));
    }

    public static int nTriangle(int target) {

        // base case
        if(target == 0) return 0;

        // recursive case
        return target + nTriangle(target-1);
    }
}
