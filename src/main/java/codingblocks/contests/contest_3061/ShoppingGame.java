package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class ShoppingGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tcs = sc.nextInt();

        while(tcs-- != 0) {
            int ayush = sc.nextInt();
            int harshit = sc.nextInt();
            whoWins(ayush, harshit);
        }
    }

    private static void whoWins(int ayush, int harshit) {

        int i = 1;
        while (true) {

            if((i & 1) == 1) {
                ayush -= i;
            } else {
                harshit -= i;
            }

            if(ayush < 0) {
                System.out.println("Harshit");
                break;
            } else if(harshit < 0) {
                System.out.println("Ayush");
                break;
            }

            i++;
        }
    }
}
