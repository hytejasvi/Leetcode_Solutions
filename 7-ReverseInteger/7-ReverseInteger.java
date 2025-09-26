// Last updated: 9/26/2025, 10:45:43 PM
class Solution {
    public int reverse(int x) {
        int res = 0;
        int y = x;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        while(y != 0) {
            int temp = y % 10;
            if(res > max / 10 || (res == max && temp > 7)) return 0;
            if(res < min / 10 || (res == min && temp < -8)) return 0;

            res = res * 10 + temp;
            y = y/10;
        }
        
        return (res > max || res < min) ? 0 : res;
    }
}