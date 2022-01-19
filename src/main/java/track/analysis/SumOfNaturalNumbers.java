package track.analysis;

import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        System.out.println(sumOfNaturalNumbers(n));
    }

    private static int sumOfNaturalNumbers(int n) {
        int i=1, sum=0;
        while (i <= n ) {
            sum=sum + i;
            i++;
        }
        return sum;
    }
}
