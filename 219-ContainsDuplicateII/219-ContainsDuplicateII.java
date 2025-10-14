// Last updated: 10/14/2025, 9:34:29 AM
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> mm = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int val = nums[i];
            if(mm.containsKey(val) && i- mm.get(val) <= k) {
                return true;
            }
            mm.put(val, i);
        }
        return false;
    }
}