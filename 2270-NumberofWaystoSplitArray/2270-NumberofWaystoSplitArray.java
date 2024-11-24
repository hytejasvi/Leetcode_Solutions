class Solution {
    public int waysToSplitArray(int[] nums) {
        long prefix = 0;
        long[] sumArray = new long[nums.length];
        int len = nums.length;
        for (int i=0;i< len;i++) {
            prefix += nums[i];
            sumArray[i] = prefix;
        }
        int count = 0;
        for (int i=0; i <len-1;i++) {
            long rightSum = sumArray[len-1] - sumArray[i];
            if (rightSum <= sumArray[i]) {
                count++;
            }
        }
        return count;
    }
}