// Last updated: 9/10/2025, 11:20:26 PM
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> myMap = new HashMap<>();
        int n = nums.length/2;        
        for(int num: nums) {
            myMap.put(num, myMap.getOrDefault(num, 0)+1);
            if(myMap.containsValue(n+1)) {
                return num;
            }
        }
        return n;
    }
}