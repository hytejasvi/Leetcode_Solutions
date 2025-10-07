// Last updated: 10/7/2025, 10:11:17 PM
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0l;
        long mx = 0l;
        int left = 0;
        Set<Integer> ms = new HashSet<>();
        for(int i=0;i< nums.length;i++) {
            while(ms.contains(nums[i])) {
                maxSum = maxSum - nums[left];
                ms.remove(nums[left]);
                left++;
            }
            maxSum = maxSum+nums[i];
            ms.add(nums[i]);
            if((i-left+1) == k) {
                mx = Math.max(mx, maxSum);
                maxSum = maxSum - nums[left];
                ms.remove(nums[left]);
                left++;
            }
        }
        return mx;
    }
}