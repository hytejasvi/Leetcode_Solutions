// Last updated: 9/9/2025, 9:44:42 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        /*for(int i=0;i< nums.length;i++) {
            for(int j=i+1;j< nums.length;j++) {
                if(nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }
        return res; */
        Map<Integer,Integer> myMap = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(myMap.containsKey(target-nums[i])) {
                res[0] = myMap.get(target-nums[i]);
                res[1] = i;
                break;
            } else {
                myMap.put(nums[i], i);
            }
        }
        return res;
    }
}