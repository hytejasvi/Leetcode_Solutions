// Last updated: 11/16/2025, 10:22:48 PM
class Solution {
    public boolean judgeSquareSum(int c) {
        if(c == 0) {
            return true;
        } 
        long res = 0;
        int left = 0;
        long right = (long) Math.sqrt(c);
        while(left <= right) {
            res = (left * left) + (right*right);
            if(res == c) {
                return true;
            } else if( res < c) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
}