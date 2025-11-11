// Last updated: 11/11/2025, 9:39:06 PM
class Solution {
    public void wiggleSort(int[] nums) {
        if(nums.length < 2) {
            return;
        }
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        int n = nums.length;
        int mid = (n + 1) / 2;
        int j = mid - 1; // end of first half
        int k = n - 1;   // end of second half

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                nums[i] = sorted[j--];
            } else {
                nums[i] = sorted[k--];
            }
        }
    }
}