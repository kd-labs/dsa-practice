package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class AnyToAnyConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int srcBase = sc.nextInt();
        int targetBase = sc.nextInt();
        int num = sc.nextInt();

        int decRep = toDecimal(num, srcBase);
        int res = toTarget(decRep, targetBase);
        System.out.println(res);
    }

    private static int toTarget(int decRep, int targetBase) {

        int res = 0;
        int i = 0;
        while(decRep > 0) {
            res += decRep%targetBase * Math.pow(10, i);
            decRep /= targetBase;
            i++;
        }

        return res;
    }

    private static int toDecimal(int num, int srcBase) {
        int decRep = 0;
        int i = 0;
        while(num > 0) {
            decRep += num % 10 * Math.pow(srcBase, i);
            num /= 10;
            i++;
        }
        return decRep;
    }
}