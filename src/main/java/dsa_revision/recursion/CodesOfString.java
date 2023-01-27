package dsa_revision.recursion;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CodesOfString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        List<String> res = new ArrayList<>();
        generateCodes("", str, res);

        System.out.print("[");
        String codes = String.join(", ", res);
        System.out.print(codes);
        System.out.print("]");
    }

    public static void generateCodes(String out, String str, List<String> res) {
        // Base Case : when input str is null or empty, then add out in final res list
        if(str == null || str.isEmpty()) {
            res.add(out);
            return;
        }

        /*
            Recursive Case
                Loop through i = 0 -> str.len
                make cuts at i
                pass out.concat(str.substring(0,i+1)) and pass str = str.substring(i+1)
         */
        for(int i = 0 ; i < str.length() ; i++) {
            int ascii = Integer.parseInt(str.substring(0, i + 1));
            if(ascii <= 26) {
                String k = out + ((char)(ascii + 96));
                generateCodes(k, str.substring(i+1), res);
            }
        }
    }
}
