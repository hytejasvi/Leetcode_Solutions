class Solution {
    public int maxWidthRamp(int[] nums) {
        int res = 0;
        int n=nums.length;
        int[] maxArr = new int[n];
        int maxEle = nums[n-1];
        for(int i=n-1;i>=0;i--) {
            maxEle = Math.max(maxEle, nums[i]);
            maxArr[i] = maxEle;
        }
        int left =0, right=0;
        while(right < n) {
            while(left < right && nums[left] > maxArr[right]) {
                left++;
            }
            res = Math.max(res, right-left);
            right++;
        }
        return res;
    }
}