package codingblocks.contests.contest_3061;


import java.util.Scanner;

public class ChewbaccaAndNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        long res = chewbaccaInverse(num);
        System.out.println(res);
    }

    private static long chewbaccaInverse(long num) {
        long res = 0;

        int i = 0;
        while(num > 9) {

            long k = num%10;
            if(9 - k < k) {
                res += (9-k) * Math.pow(10, i);
            } else {
                res += k * Math.pow(10, i);
            }

            i++;
            num = num / 10;
        }

        if(num == 9 || num < 5) {
            res += num * Math.pow(10, i);
        } else {
            res += (9-num) * Math.pow(10, i);
        }

        return res;
    }
}

//9454598352
//444401340

//