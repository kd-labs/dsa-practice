package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class ShoppingGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tcs = sc.nextInt();

        while(tcs-- != 0) {
            int ayush = sc.nextInt();
            int harshit = sc.nextInt();

            winner(ayush, harshit);
        }
    }

    private static void winner(int ayush, int harshit) {

        int i = 1;
        while (true) {
            if(i % 2 == 1) {
                // deduct from ayush
                ayush -= i;
            } else {
                // deduct from harshit
                harshit -= i;
            }

            // check if ayush is in -ve
            if(ayush <= 0) {
                System.out.println("Harshit");
                break;
            } else if(harshit <= 0) {
                System.out.println("Aayush");
                break;
            }

            i++;
        }
    }
}
