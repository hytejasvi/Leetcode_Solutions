// Last updated: 11/11/2025, 6:22:44 PM
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] ans = new int[n];
        int index = 0;

        for (int num : nums) {
            if (num < pivot) {
                ans[index++] = num;
            }
        }

        for (int num : nums) {
            if (num == pivot) {
                ans[index++] = num;
            }
        }

        for (int num : nums) {
            if (num > pivot) {
                ans[index++] = num;
            }
        }

        return ans;
    }
}
