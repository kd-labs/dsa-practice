package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class CanYouReadThis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        printCamelCase(s);
    }

    private static void printCamelCase(String s) {
        int start = 0, end = 0;
        while(end < s.length()) {
            if(Character.isUpperCase(s.charAt(end))) {
                printWord(s, start, end);
                start = end;
            }
            end++;
        }
        printWord(s, start, end);
    }

    private static void printWord(String s, int start, int end) {
        for(int i = start ; i < end ; i++) {
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }
}
