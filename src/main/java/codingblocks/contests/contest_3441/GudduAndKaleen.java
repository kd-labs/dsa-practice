package codingblocks.contests.contest_3441;

import java.util.Scanner;

public class GudduAndKaleen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String enemyName = sc.next();

        int tcs = sc.nextInt();

        while(tcs-- > 0) {
            int i = sc.nextInt()-1;
            int j = sc.nextInt()-1;
            int times = sc.nextInt();

            for(int k = 0 ; k < times; k++) {
                enemyName = enemyName.substring(0, i) + enemyName.charAt(j) + enemyName.substring(i, j) + enemyName.substring(j+1);
            }
        }

        System.out.println(enemyName);
    }
}
