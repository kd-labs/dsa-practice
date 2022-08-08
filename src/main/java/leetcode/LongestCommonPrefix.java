package leetcode;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class LongestCommonPrefix {

    public static void main(String[] args) {

//        String[] strings = {"flower", "flow", "flight"};
        String[] strings = {"cir", "car"};

        String res = longestCommonPrefix(strings);
        System.out.println(res);

    }

    private static String longestCommonPrefix(String[] strings) {
        OptionalInt min = Arrays.stream(strings).mapToInt(x -> x.length()).min();

        // guard clause for edge case
        if(min.getAsInt() == 0) return "";

        String res = "";

        int minLength = min.getAsInt();

        for(int i = 0 ; i < minLength ; i++) {
            int finalI = i;
            if(Arrays.stream(strings).mapToInt(x -> x.charAt(finalI)).distinct().count() == 1) {
                res += Character.toString(strings[0].charAt(i));
            } else {
                break;
            }
        }

        return res;

    }


}
