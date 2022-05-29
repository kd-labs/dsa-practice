package codingblocks.contests.contest_3061;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindingCBNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String str = sc.next();

        int res = maxCBNumbers(str);
        System.out.println(res);
    }

    private static int maxCBNumbers(String str) {

        int count = 0;
        boolean[] visited = new boolean[str.length()];
        for(int j = 1 ; j <= str.length() ; j++) {
            for(int i = 0 ; i+j <= str.length() ; i++) {
//                System.out.println(str.substring(i, i+j));
                if(!hasVisited(visited, i, i+j-1) && isCBNumber(str.substring(i, i+j))){
                    count++;
                    markVisited(visited, i, i+j-1);
                }
            }
        }
        return count;
    }

//    private static boolean isCBNumber(String substring) {
//        long l = Long.parseLong(substring);
//
//        if(l == 0l || l == 1l) return false;
//        else if(l == 2 || l == 3) return true;
//        else if(l % 2l == 0 || l % 3l == 0) return false;
//
//        for(long i = 5 ; i * i <= l ; i = i + 6) {
//            if((l % i) == 0 || l % (i+2) == 0) return false;
//        }
//
//        return true;
//
//    }

    private static boolean isCBNumber(String substring){
        long n = Long.parseLong(substring);
        int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
        if (n == 0 || n == 1) {
            return false;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return true;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (n % arr[i] == 0) {
                return false;
            }
        }

        return true;
    }

    private static boolean hasVisited(boolean[] visited, int i, int j) {
        for(; i<=j ;i++) {
            if(visited[i]) return true;
        }
        return false;
    }

    private static void markVisited(boolean[] visited, int i, int j) {

        for(;i<=j ; i++) {
            visited[i] = true;
        }
    }

}
