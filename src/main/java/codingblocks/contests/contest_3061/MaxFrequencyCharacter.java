package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class MaxFrequencyCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String res = maxFreqCharacter(str);
        System.out.println(res);
    }

    /*
        Input : aaabacb
        Intuition :
            Finding the character with max count i.e. votes(intuition)
            So we apply moore's voting algorithm
     */
    private static String maxFreqCharacter(String str) {

        char ch = str.charAt(0);
        int count = 1;
        for(int i = 1 ; i < str.length() ; i++) {
            if(str.charAt(i) == ch) count++;
            else {
                count--;
                if(count == 0) {
                    ch = str.charAt(i);
                    count = 1;
                }
            }
        }

        return Character.toString(ch);
    }
}
