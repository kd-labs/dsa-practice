package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class AlexGoesShopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int[] nums = new int[arrSize];
        int i = 0;
        while(i < arrSize) {
            nums[i++] = sc.nextInt();
        }
        int queries = sc.nextInt();
        int count;
        while(queries > 0) {
            int amount = sc.nextInt();
            int claim = sc.nextInt();
            count = 0;
            for(int k = 0 ; k < arrSize ; k++) {
               if(amount % nums[k] == 0) count++;
            }
            if(count >= claim) System.out.println("Yes");
            else System.out.println("No");

            queries--;
        }
    }
}