package codingblocks.contests.contest_3061;

import java.util.*;

public class SumOfTwoArrays {


    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1Size = sc.nextInt();
        Integer[] num1Arr = new Integer[num1Size];

        for(int i = 0 ; i < num1Size ; i++) {
            num1Arr[i] = sc.nextInt();
        }

        int num2Size = sc.nextInt();
        Integer[] num2Arr = new Integer[num2Size];

        for(int i = 0 ; i < num2Size ; i++) {
            num2Arr[i] = sc.nextInt();
        }

        List<Integer> sum = sum(Arrays.asList(num1Arr), Arrays.asList(num2Arr));

        for(int i = 0 ; i < sum.size() ; i++) {
            System.out.print(sum.get(i) + ", ");
        }
        System.out.println("END");

    }

    private static List<Integer> sum(List<Integer> num1Arr, List<Integer> num2Arr) {
        List<Integer> sum = new ArrayList();
        Collections.reverse(num1Arr);
        Collections.reverse(num2Arr);

        int k = Math.max(num1Arr.size(), num2Arr.size());
        int digit1 = 0, digit2 = 0, digitSum = 0, carry = 0;
        for(int i = 0 ; i < k ; i++) {
            if(i < num1Arr.size()) {
                digit1 = num1Arr.get(i);
            } else {
                digit1 = 0;
            }

            if(i < num2Arr.size()) {
                digit2 = num2Arr.get(i);
            } else {
                digit2 = 0;
            }

            digitSum = digit1 + digit2 + carry;
            carry = digitSum / 10;

            sum.add(digitSum % 10);

        }
        Collections.reverse(sum);
        return sum;
    }
}
