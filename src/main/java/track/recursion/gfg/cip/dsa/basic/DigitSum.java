package track.recursion.gfg.cip.dsa.basic;

public class DigitSum {

    public static void main(String[] args) {

        int tc1 = 253;
        int tc2 = 9987;
        int tc3 = 10;

        System.out.printf("%s digit sum is %d\n", String.valueOf(tc1), digitSum(tc1, 0));
        System.out.printf("%s digit sum is %d\n", String.valueOf(tc2), digitSum(tc2, 0));
        System.out.printf("%s digit sum is %d\n", String.valueOf(tc3), digitSum(tc3, 0));

    }

    private static int digitSum(int x, int sum) {
        if(x == 0) return sum;

        return digitSum(x/10, ((x%10) + sum));
    }
}
