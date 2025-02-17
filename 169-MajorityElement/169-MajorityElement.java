class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length -1;
        int ans = n/2;
        return nums[ans];   
    }
}