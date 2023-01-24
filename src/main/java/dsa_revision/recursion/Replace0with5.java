package dsa_revision.recursion;

import java.util.Scanner;

public class Replace0with5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();

        System.out.println(replace0with5(target));
    }

    public static int replace0with5(int num) {

        // base case
        if(num == 0) return num;

        // recursion case
        int mod = num % 10;
        int res = replace0with5(num/10);
        return mod == 0 ? res*10+5 : res*10+mod;
    }
}
