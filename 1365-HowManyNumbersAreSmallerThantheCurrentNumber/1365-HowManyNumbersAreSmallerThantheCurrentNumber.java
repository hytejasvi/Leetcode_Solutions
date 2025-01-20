class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int []sortedArray = nums.clone();
        Arrays.sort(sortedArray);
        Map<Integer, Integer> myMap = new HashMap<>();
        for(int i=0;i< sortedArray.length;i++) {
            if(!myMap.containsKey(sortedArray[i])) {
                myMap.put(sortedArray[i], i);
            }
        }
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            res[i] = myMap.get(nums[i]);
        }
        return res;
    }
}