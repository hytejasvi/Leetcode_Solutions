// Last updated: 9/8/2025, 8:56:01 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int sum = 0;
        for(int m: nums) {
            sum = sum+ m;
        }
        return expectedSum - sum;
    }
}