package leetcode;

public class FirstBadVersion {

    public static void main(String[] args) {

    }

    private static int firstBadVersion(int n) {
        int l = 1, h = n;

        int res = -1, mid;
        while(l <= h) {
            mid = l + (h-l)/2;
//            if(isBadVersion(mid)) {
//                res = mid;
//                h = mid-1;
//            } else {
//                l = mid+1;
//            }
        }
        return res;
    }
}
