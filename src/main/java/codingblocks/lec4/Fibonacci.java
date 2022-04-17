package codingblocks.lec4;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = getNFibonacci(n);
        System.out.println(res);
    }

    private static int getNFibonacci(int n) {

        int i = 0, a = 0, b = 1, c=0;

        while (i <= n-2) {
           c = a+b;
           a = b;
           b = c;

           i++;
        }

        return b;
    }
}
