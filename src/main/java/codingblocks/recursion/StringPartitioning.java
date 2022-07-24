package codingblocks.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringPartitioning {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        List<List<String>> ans = new ArrayList<>();

        printStringPartition(str, new ArrayList<>(), ans);
        ans.forEach(System.out::println);

    }

    private static void printStringPartition(String ques, List<String> subList, List<List<String>> ans) {

        // Base Case
        if(ques.length() == 0) {
            ans.add(new ArrayList<>(subList));
        }

        for(int i = 1 ; i <= ques.length() ; i++) {
            String s = ques.substring(0, i);
            if(isPalindrome(s)) {
                subList.add(s);
                printStringPartition(ques.substring(i), subList, ans);
                subList.remove(subList.size()-1);
            }
        }
    }

    private static boolean isPalindrome(String str) {
        int len = str.length();
        for(int i = 0 ; i < len/2 ; i++) {

            if(str.charAt(i) != str.charAt(len-1-i)) return false;
        }

        return true;
    }


}
