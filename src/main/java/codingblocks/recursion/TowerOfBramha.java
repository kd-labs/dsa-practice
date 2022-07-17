package codingblocks.recursion;

import java.util.Scanner;

public class TowerOfBramha {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int discs = sc.nextInt();

        String sourceRod = "A";
        String helperRod = "B";
        String destRod = "C";

        moveDiscs(discs, sourceRod, helperRod, destRod);
    }

    private static void moveDiscs(int n, String srcRod, String helperRod, String destRod) {

        if(n == 0) return;

        // Move n - 1 discs from src = srcRod to dest = helperRod using helper = destRod
        moveDiscs(n-1, srcRod, destRod, helperRod);

        // Move nth disc from src = srcRod to dest = destRod using helper = helperRod
        System.out.println(String.format("Move %dth disc from src=%s to dest=%s", n, srcRod, destRod));

        // Move n-1 discs from src = helperRod to dest = destRod using helper = srcRod
        moveDiscs(n-1, helperRod, srcRod, destRod);
    }


}
