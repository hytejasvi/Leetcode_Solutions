class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0;
        int currentSum = 0;
        Map<Integer, Integer> myMap = new HashMap<>();
        myMap.put(0,1);
        for (int num : nums) {
            currentSum = currentSum + num;
            if (myMap.containsKey(currentSum - k)) {
                //res++;
                res = res + myMap.get(currentSum - k);
            }
            myMap.put(currentSum, myMap.getOrDefault(currentSum, 0)+1);
        }
        return res;
    }
}