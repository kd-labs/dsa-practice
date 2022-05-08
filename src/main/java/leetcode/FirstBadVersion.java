package leetcode;

public class FirstBadVersion {

    public static void main(String[] args) {

    }

    private static int firstBadVersion(int n) {
        int l = 0, h = n-1;

        int res = -1, mid;
        while(l < h) {
            mid = l + (h-l)/2;
            if(isBadVersion(mid)) {
                h = mid;
            } else {
                l = mid+1;
            }
        }

        return l;
    }
}
