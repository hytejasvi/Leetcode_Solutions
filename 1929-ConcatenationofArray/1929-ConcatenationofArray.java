// Last updated: 11/12/2025, 2:50:52 PM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res = new int[nums.length * 2];
        int n = nums.length;
        res[0] = nums[0];
        res[n] = nums[0];
        for(int i=1;i < n;i++) {
            res[i] = nums[i];
            res[n+i] = nums[i];
        }
        return res;
    }
}