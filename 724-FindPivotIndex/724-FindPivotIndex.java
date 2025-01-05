class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int[] sumArray = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            sum = sum+nums[i];
            sumArray[i] = sum;
        }
        int start = 0;
        int res = -1;
        int end = nums.length-1;
        for(int right=0;right<nums.length;right++) {
            if((sumArray[end] - sumArray[start]) == 0) {
                return 0;
            }
            if(sumArray[end]-sumArray[right] == sumArray[right] - nums[right]) {
                return right;
            }
        }
        return res;
    }
}