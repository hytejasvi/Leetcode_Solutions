class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> myMap = new HashMap<>();
        int maxVal = 0;
        int minKey = Integer.MAX_VALUE;
        for(int n: nums){
            if(n %2 == 0) {
                myMap.put(n, myMap.getOrDefault(n, 0) + 1);
                maxVal = Math.max(maxVal, myMap.get(n));
            }
        }
        for(Map.Entry<Integer, Integer> m : myMap.entrySet()) {
            if(m.getValue() == maxVal) {
                minKey = Math.min(minKey, m.getKey());
            }
        }
        return minKey ==  Integer.MAX_VALUE ? -1: minKey;
    }
}