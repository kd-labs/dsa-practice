package leetcode;

public class MaxConsecutiveOnes {

    public static void main(String[] args) {
//        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
//        int k = 2;

//        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
//        int k = 3;

//        int[] nums = {0,0,0,0};
//        int k = 0;
        int[] nums = {0,0,0,0};
        int k = 4;


        int res = maxConsecutiveOnesBrute(nums, k);
        System.out.println(res);
    }

    private static int maxConsecutiveOnesBrute(int[] nums, int k) {
        int res = 0;
        int len = nums.length;

        for(int i = 0 ; i < len ; i++) {

            int flips = k;

            for(int j = i ; j < len ; j++) {
                if(nums[j] == 0) {
                    if(flips > 0) {
                        flips--;
                    } else break;
                }
                res = Math.max(res, j+1-i);
            }

        }

        return res;


    }
}
