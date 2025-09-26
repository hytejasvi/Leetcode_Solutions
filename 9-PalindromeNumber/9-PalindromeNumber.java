// Last updated: 9/26/2025, 11:07:42 PM
class Solution {
    public boolean isPalindrome(int x) {
        if(x == 0) {
            return true;
        }
        if((x < 0) || (x%10 == 0)) {
            return false;
        }
        int res = 0;
        int y = x;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        while(y != 0) {
            int temp = y %10;
            if(res > max / 10 || (res == max && temp > 7)) return false;
            if(res < min / 10 || (res == min && temp < -8)) return false;
            res = res * 10 + temp;
            y = y / 10;
        }
        return res == x ? true: false;
    }
}