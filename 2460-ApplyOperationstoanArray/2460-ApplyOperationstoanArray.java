// Last updated: 11/8/2025, 8:44:45 PM
class Solution {
    public int[] applyOperations(int[] nums) {
        int left = 0;
        int[] res = new int[nums.length];
        int k=0;
        for (int right =1;right<nums.length;right++) {
            if (nums[left] == nums[right]) {
                res[k] = nums[left] * 2;
                nums[right] = 0;
                left++;
                k++;
            } else {
                res[k] = nums[left];
                k++;
                left++;
            }
        }
        res[k] = nums[left];
        int j=0;
        for (int i=0;i< res.length;i++) {
            if (res[i] != 0) {
                res[j] = res[i];
                j++;
            }
        }
        for (int i=j;i<res.length;i++) {
            res[i] = 0;
        }
        return res;
    }
}