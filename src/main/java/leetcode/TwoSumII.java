package leetcode;

public class TwoSumII {

    public static void main(String[] args) {
//        int[] numbers = {2,7,11,15};
//        int target = 9;
        int[] numbers = {-1, 0};
        int target = -1;

//        int[] res = twoSumBrute(numbers, target);
        int[] res = twoSumOptimized(numbers, target);
        System.out.println(res[0] + " " + res[1]);
    }

    private static int[] twoSumOptimized(int[] numbers, int target) {
        int[] res = new int[2];

        int left = 0, right = numbers.length-1, sum;

//        int[] numbers = {2,7,11,15}, target = 9
//        numbers = [2,3,4], target = 7
//        int[] numbers = {-1, 0}, target = -1
        while (left < right) {
            sum = numbers[left] + numbers[right];
            if(sum == target) {
                res[0] = left + 1;
                res[1] = right + 1;
                return res;
            } else if(sum > target) right--;
            else left++;
        }

        return res;
    }

    private static int[] twoSumBrute(int[] numbers, int target) {
        int[] res = new int[2];

        for(int i = 0 ; i < numbers.length ; i++) {
            if(res[0] != res[1]) return res;
            for(int j = 0 ; j < numbers.length ; j++) {
                if(j == i) continue;
                if(numbers[i] + numbers[j] == target) {
                    res[0] = ++i;
                    res[1] = ++j;
                    break;
                }
            }
        }

        return res;
    }
}
