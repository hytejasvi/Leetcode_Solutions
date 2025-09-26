// Last updated: 9/26/2025, 10:49:48 PM
class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num == 0) {
            return true;
        } else if(num % 10 == 0) {
            return false;
        } else {
            return true;
        }
    }
}