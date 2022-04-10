package codingblocks.lec4;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int revn = reverseNumber(n);
        System.out.println(revn);
    }

    private static int reverseNumber(int n) {
        int revNum = 0;

        while(n > 0) {
            revNum *= 10;
            revNum += n%10;
            n = n/10;
        }

        return revNum;
    }
}
