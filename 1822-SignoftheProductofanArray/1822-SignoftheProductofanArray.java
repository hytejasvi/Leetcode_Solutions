// Last updated: 11/9/2025, 10:24:59 AM
class Solution {
    public int arraySign(int[] nums) {
        int countNegative = 0;
        
        for (int num : nums) {
            if (num == 0) return 0;      // zero makes product zero
            if (num < 0) countNegative++; // track negatives
        }
        
        // even negatives → positive, odd → negative
        return (countNegative % 2 == 0) ? 1 : -1;
    }
}
