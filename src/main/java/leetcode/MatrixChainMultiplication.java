package leetcode;

public class MatrixChainMultiplication {

    public static void main(String[] args) {
        MatrixChainMultiplication matrixChainMultiplication = new MatrixChainMultiplication();
        int[] arr = {4,2,3,5,1};
        System.out.println(matrixChainMultiplication.mcm(arr, 0, arr.length-1));
    }

    public int mcm(int[] matrixArr, int start, int end) {
        if(start+1 == end) return 0;
        int ans = Integer.MAX_VALUE;
        for(int cut = start + 1; cut < end ; cut++) {

            int fs = mcm(matrixArr, start, cut);
            int ss = mcm(matrixArr, cut, end);
            int self = matrixArr[start]*matrixArr[cut]*matrixArr[end];
            ans = Math.min(ans, fs+ss+self);
        }
        return ans;
    }
}
