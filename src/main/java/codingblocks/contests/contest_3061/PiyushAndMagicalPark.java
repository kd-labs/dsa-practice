package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class PiyushAndMagicalPark {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int k = sc.nextInt();
        int s = sc.nextInt();
        String[][] park = new String[rows][cols];

        for(int i = 0 ; i < rows ; i++) {
            for(int m = 0 ; m < cols ; m++) {
               park[i][m] = sc.next();
            }
        }

        int strength = walkInThePark(park, k, s);
        if(strength > k) {
            System.out.println("Yes");
            System.out.println(strength);
        } else {
            System.out.println("No");
        }

    }

    private static int walkInThePark(String[][] park, int k, int s) {

        int rows = park.length;
        int cols = park[0].length;

        for(int i = 0 ; i < rows ; i++) {
            for(int m = 0 ; m < cols && s > k ; m++, s--) {

                if(m == cols-1) s++;

                // if cell has '.', -2 from s
                if(park[i][m].equals(".")) {
                    s -= 2;
                } else if(park[i][m].equals("*")) { // if cell has '*' +5 to s
                    s += 5;
                } else if(park[i][m].equals("#")) { // if cell has '#' break from current row
                    break;
                }
            }
        }

        return s;

    }
}
