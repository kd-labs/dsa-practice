package codingblocks.contests.contest_3061;

import java.util.Scanner;
import java.util.regex.Pattern;

public class LowerUpper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next(".").charAt(0);

        Pattern lowerCasePattern = Pattern.compile("[a-z]");
        Pattern upperCasePattern = Pattern.compile("[A-Z]");

        if(lowerCasePattern.matcher(String.valueOf(c)).matches()) {
            System.out.println("lowercase");
        } else if(upperCasePattern.matcher(String.valueOf(c)).matches()){
            System.out.println("UPPERCASE");
        } else {
            System.out.println("Invalid");
        }

    }
}
