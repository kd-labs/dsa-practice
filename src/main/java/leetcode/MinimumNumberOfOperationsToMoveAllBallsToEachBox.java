package leetcode;

public class MinimumNumberOfOperationsToMoveAllBallsToEachBox {

    public static void main(String[] args) {

        String boxes = "001011";

        int[] answer = minNumberOfOpsToMoveAllBallsToEachBoxBrute(boxes);
//        int[] answer = minNumberOfOpsToMoveAllBallsToEachBoxOptimized(boxes);
        for (int i : answer) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // TODO : Work on the optimal solution
    private static int[] minNumberOfOpsToMoveAllBallsToEachBoxOptimized(String boxes) {
        int length = boxes.length();
        int[] answer = new int[length];
        int cnt = 0;

//        String boxes = "001011";
//        Left -> Right
//        answer = [0, 0, 0, 1, 2, 4 ];
        for(int i = 0 ; i < length ; i++) {
            answer[i] += cnt;
            if(boxes.charAt(i) == '1') {
                cnt++;
            }
        }

//        String boxes = "001011";
//        Left <- Right
//        answer = [11, 8, 5, 4, 3, 4 ];
        for(int i = length-1 ; i >= 0 ; i--) {
            answer[i] += cnt;
        }
        return answer;
    }

    private static int[] minNumberOfOpsToMoveAllBallsToEachBoxBrute(String boxes) {
        int length = boxes.length();
        int[] answer = new int[length];

        for(int i = 0 ; i < length ; i++) {

            for(int j = 0 ; j < length ; j++) {
                if(boxes.charAt(j) != '0') {
                    answer[i] += Math.abs(i-j);
                }
            }
        }

        return answer;
    }
}
