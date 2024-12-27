class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        final int MOD = 1_000_000_007;
        int left = 0, right = nums.length-1, cs = 0, count=0;
        int[] power = new int[nums.length];
        power[0] = 1;
        for (int i=1;i< nums.length;i++) {
            power[i] = (power[i-1] * 2) %MOD;
        }
        while (right >= left) {
            if (nums[right] + nums[left] <= target) {
                count = (count + power[right-left]) % MOD;
                left++;
            } else {
                right --;
            }
        }
        return count;
    }
}