// Last updated: 11/19/2025, 8:36:53 AM
class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> seen = new HashSet<>();
        for(int num : nums) {
            seen.add(num);
        }
        while(seen.contains(original)) {
            original = original*2;
        }
        return original;
    }
}