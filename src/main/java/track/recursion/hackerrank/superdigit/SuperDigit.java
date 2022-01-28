package track.recursion.hackerrank.superdigit;

public class SuperDigit {

    public static void main(String[] args) {

        System.out.println(solve("861568688536788", 100000));

    }

    private static int solve(String n, int k) {

        int N = 0;
        for(int i = 0 ; i < n.length() ; i++) {
            N += Character.getNumericValue(n.charAt(i));
        }

        int res = k * digitSum(N);
        while(res > 10) {
            res = digitSum(res);
        }
        return res;
    }

    /*
        Hypothesis :
            digitSum(148) -> 4
            digitSum(22) -> 4
            digitSum(4) -> 4
     */
    private static int digitSum(long n) {

        if( n < 10) return (int) n;

        int ones_place = (int) (n % 10);
        return digitSum((n/10) + ones_place);
    }
}
