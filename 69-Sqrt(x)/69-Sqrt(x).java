// Last updated: 11/5/2025, 8:56:51 PM
class Solution {
    public int mySqrt(int x) {
        if(x == 0) {
            return 0;
        }
        if(x < 4) {
            return 1;
        }
        int left = 1, right = x;
        int res = 1;
        while(left <= right) {
            int mid = left+ (right-left)/2;
            if(mid <= x/mid) {
                res = Math.max(res, mid);
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return res;
    }
}